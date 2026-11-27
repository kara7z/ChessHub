package com.chesshub.backend.common.error;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.core.MethodParameter;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.FieldError;
import org.springframework.validation.method.ParameterErrors;
import org.springframework.validation.method.ParameterValidationResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        return validationResponse(exception, headers, status, request,
                exception.getBindingResult().getFieldErrors().stream().map(ApiExceptionHandler::fieldIssue));
    }

    @Override
    protected ResponseEntity<Object> handleHandlerMethodValidationException(
            HandlerMethodValidationException exception, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        if (exception.isForReturnValue()) {
            return handleExceptionInternal(exception, null, headers, status, request);
        }
        return validationResponse(exception, headers, status, request,
                exception.getParameterValidationResults().stream().flatMap(ApiExceptionHandler::parameterIssues));
    }

    private ResponseEntity<Object> validationResponse(Exception exception, HttpHeaders headers,
            HttpStatusCode status, WebRequest request, Stream<ApiError.FieldIssue> issues) {
        List<ApiError.FieldIssue> fields = issues
                .distinct()
                .toList();
        ApiError body = new ApiError(status.value(), "VALIDATION_FAILED", "Request validation failed.", fields);
        return handleExceptionInternal(exception, body, headers, status, request);
    }

    private static ApiError.FieldIssue fieldIssue(FieldError error) {
        return new ApiError.FieldIssue(error.getField(), Objects.toString(error.getCode(), "Invalid"));
    }

    private static Stream<ApiError.FieldIssue> parameterIssues(ParameterValidationResult result) {
        if (result instanceof ParameterErrors errors) {
            return errors.getFieldErrors().stream().map(ApiExceptionHandler::fieldIssue);
        }
        String name = requestParameterName(result.getMethodParameter());
        return result.getResolvableErrors().stream().map(error -> {
            String[] codes = error.getCodes();
            String code = codes == null || codes.length == 0 ? "Invalid" : codes[codes.length - 1];
            return new ApiError.FieldIssue(name, code);
        });
    }

    private static String requestParameterName(MethodParameter parameter) {
        for (var annotation : parameter.getParameterAnnotations()) {
            String name = switch (annotation) {
                case RequestParam param -> nameOrValue(param.name(), param.value());
                case PathVariable path -> nameOrValue(path.name(), path.value());
                case RequestHeader header -> nameOrValue(header.name(), header.value());
                case CookieValue cookie -> nameOrValue(cookie.name(), cookie.value());
                case MatrixVariable matrix -> nameOrValue(matrix.name(), matrix.value());
                case RequestPart part -> nameOrValue(part.name(), part.value());
                default -> "";
            };
            if (StringUtils.hasText(name)) {
                return name;
            }
        }
        return Objects.toString(parameter.getParameterName(), "arg" + parameter.getParameterIndex());
    }

    private static String nameOrValue(String name, String value) {
        return StringUtils.hasText(name) ? name : value;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<Object> handleNotFound(EntityNotFoundException exception, WebRequest request) {
        return handleExceptionInternal(exception, null, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({DuplicateKeyException.class, OptimisticLockingFailureException.class})
    ResponseEntity<Object> handleConflict(Exception exception, WebRequest request) {
        return handleExceptionInternal(exception, null, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    ResponseEntity<Object> handleIntegrityViolation(DataIntegrityViolationException exception, WebRequest request) {
        if (exception.getMostSpecificCause() instanceof SQLException sqlException
                && ("23505".equals(sqlException.getSQLState()) || "23503".equals(sqlException.getSQLState()))) {
            return handleConflict(exception, request);
        }
        throw exception;
    }

    @Override
    protected ResponseEntity<Object> createResponseEntity(
            Object body, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.addAll(headers);
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        ApiError error = body instanceof ApiError apiError ? apiError : ApiError.from(status);
        return super.createResponseEntity(error, responseHeaders, status, request);
    }
}

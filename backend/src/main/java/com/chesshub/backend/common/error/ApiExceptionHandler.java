package com.chesshub.backend.common.error;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<ApiError.FieldIssue> fields = exception.getBindingResult().getFieldErrors().stream()
                .map(error -> new ApiError.FieldIssue(error.getField(), Objects.toString(error.getCode(), "Invalid")))
                .distinct()
                .toList();
        ApiError body = new ApiError(status.value(), "VALIDATION_FAILED", "Request validation failed.", fields);
        return handleExceptionInternal(exception, body, headers, status, request);
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

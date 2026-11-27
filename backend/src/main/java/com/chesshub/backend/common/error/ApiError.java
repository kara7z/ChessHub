package com.chesshub.backend.common.error;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public record ApiError(int status, String code, String message, List<FieldIssue> fieldErrors) {

    public record FieldIssue(String field, String code) {
    }

    public static ApiError from(HttpStatusCode status) {
        return switch (status.value()) {
            case 400 -> of(HttpStatus.BAD_REQUEST, "INVALID_REQUEST", "The request is invalid.");
            case 401 -> of(HttpStatus.UNAUTHORIZED, "UNAUTHENTICATED", "Authentication is required.");
            case 403 -> of(HttpStatus.FORBIDDEN, "FORBIDDEN", "You do not have access to this resource.");
            case 404 -> of(HttpStatus.NOT_FOUND, "NOT_FOUND", "The requested resource was not found.");
            case 409 -> of(HttpStatus.CONFLICT, "CONFLICT", "The request conflicts with the current resource state.");
            default -> fallback(status);
        };
    }

    private static ApiError fallback(HttpStatusCode status) {
        if (status.is5xxServerError()) {
            return of(status, "SERVER_ERROR", "The server could not complete the request.");
        }
        return of(status, "HTTP_" + status.value(), "The request could not be completed.");
    }

    private static ApiError of(HttpStatusCode status, String code, String message) {
        return new ApiError(status.value(), code, message, List.of());
    }
}

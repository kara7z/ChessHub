package com.chesshub.backend.common.error;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLException;
import java.util.Base64;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import tools.jackson.databind.json.JsonMapper;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties =
        "spring.autoconfigure.exclude=org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration")
@Import(ApiErrorTests.Fixtures.class)
class ApiErrorTests {

    private static final String PRIVATE_DETAIL = "private-internal-detail";
    private static final String PLAYER = "player:fixture";
    private final JsonMapper json = new JsonMapper();

    @LocalServerPort
    private int port;

    @Test
    void returnsJsonForAnonymousAndInvalidBasicAuthentication() throws Exception {
        var response = send("/api/v1/protected", null, null);
        assertError(response, 401, "UNAUTHENTICATED");
        assertThat(response.headers().firstValue("WWW-Authenticate")).hasValue("Basic realm=\"ChessHub\"");
        assertError(send("/api/v1/protected", "player:invalid", null), 401, "UNAUTHENTICATED");
    }

    @Test
    void deniesPlayerAccessToAdminApiAndKeepsCsrfProtection() throws Exception {
        assertError(send("/api/v1/dashboard/accounts", PLAYER, null), 403, "FORBIDDEN");
        assertError(send("/api/v1/validation", PLAYER, "{}"), 403, "FORBIDDEN");
    }

    @Test
    void sanitizesValidationAndMalformedJsonResponses() throws Exception {
        var csrf = send("/api/v1/csrf", PLAYER, null);
        var response = send("/api/v1/validation", PLAYER, "{\"password\":\"" + PRIVATE_DETAIL + "\"}",
                csrf);
        ApiError error = assertError(response, 400, "VALIDATION_FAILED");
        assertThat(error.fieldErrors()).containsExactly(new ApiError.FieldIssue("password", "Size"));
        assertError(send("/api/v1/validation", PLAYER, "{\"password\":" + PRIVATE_DETAIL, csrf),
                400, "INVALID_REQUEST");
    }

    @Test
    void identifiesInvalidRequestParametersByTheirPublicNames() throws Exception {
        var query = send("/api/v1/search?page-size=0", PLAYER, null);
        assertThat(assertError(query, 400, "VALIDATION_FAILED").fieldErrors())
                .containsExactly(new ApiError.FieldIssue("page-size", "Min"));
        var path = send("/api/v1/records/0", PLAYER, null);
        assertThat(assertError(path, 400, "VALIDATION_FAILED").fieldErrors())
                .containsExactly(new ApiError.FieldIssue("record-id", "Min"));
    }

    @Test
    void treatsInvalidControllerReturnValuesAsServerErrors() throws Exception {
        var response = send("/api/v1/invalid-output", PLAYER, null);
        assertThat(assertError(response, 500, "SERVER_ERROR").fieldErrors()).isEmpty();
    }

    @Test
    void sanitizesMissingConflictAndUnhandledErrors() throws Exception {
        assertError(send("/api/v1/unknown", PLAYER, null), 404, "NOT_FOUND");
        assertError(send("/api/v1/missing", PLAYER, null), 404, "NOT_FOUND");
        assertError(send("/api/v1/conflict", PLAYER, null), 409, "CONFLICT");
        assertError(send("/api/v1/failure?trace=true&message=true", PLAYER, null), 500, "SERVER_ERROR");
    }

    private ApiError assertError(HttpResponse<String> response, int status, String code) {
        assertThat(response.statusCode()).isEqualTo(status);
        assertThat(response.headers().firstValue("Content-Type")).hasValueSatisfying(
                type -> assertThat(type).startsWith("application/json"));
        assertThat(response.body()).doesNotContain(PRIVATE_DETAIL, "stackTrace", "\"exception\"");
        ApiError error = json.readValue(response.body(), ApiError.class);
        assertThat(error.status()).isEqualTo(status);
        assertThat(error.code()).isEqualTo(code);
        assertThat(error.message()).isNotBlank();
        assertThat(error.fieldErrors()).isNotNull();
        return error;
    }

    private HttpResponse<String> send(String path, String credentials, String body)
            throws IOException, InterruptedException {
        return send(path, credentials, body, null);
    }

    private HttpResponse<String> send(String path, String credentials, String body, HttpResponse<String> csrf)
            throws IOException, InterruptedException {
        HttpRequest.Builder request = HttpRequest.newBuilder(URI.create("http://localhost:" + port + path))
                .header("Accept", "text/html");
        if (credentials != null) {
            request.header("Authorization", "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes(UTF_8)));
        }
        if (body != null) {
            request.header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(body));
        }
        if (csrf != null) {
            String cookie = csrf.headers().firstValue("Set-Cookie").orElseThrow().split(";", 2)[0];
            request.header("Cookie", cookie).header("X-CSRF-TOKEN", csrf.body());
        }
        try (var client = HttpClient.newHttpClient()) {
            return client.send(request.build(), HttpResponse.BodyHandlers.ofString());
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    @Import(FixtureController.class)
    static class Fixtures {
        @Bean
        InMemoryUserDetailsManager fixtureUsers() {
            return new InMemoryUserDetailsManager(
                    User.withUsername("player").password("{noop}fixture").roles("PLAYER").build());
        }
    }

    @RestController
    static class FixtureController {
        @GetMapping("/api/v1/csrf")
        String csrf(CsrfToken token) {
            return token.getToken();
        }

        @PostMapping("/api/v1/validation")
        void validate(@Valid @RequestBody ValidationRequest input) {
        }

        @GetMapping("/api/v1/search")
        void search(@RequestParam("page-size") @Min(1) int pageSize) {
        }

        @GetMapping("/api/v1/records/{record-id}")
        void record(@PathVariable("record-id") @Min(1) int recordId) {
        }

        @GetMapping("/api/v1/invalid-output")
        @NotNull
        String invalidOutput() {
            return null;
        }

        @GetMapping("/api/v1/missing")
        void missing() {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, PRIVATE_DETAIL);
        }

        @GetMapping("/api/v1/conflict")
        void conflict() {
            throw new DataIntegrityViolationException(PRIVATE_DETAIL, new SQLException(PRIVATE_DETAIL, "23505"));
        }

        @GetMapping("/api/v1/failure")
        void failure() {
            throw new IllegalStateException(PRIVATE_DETAIL);
        }
    }

    record ValidationRequest(@Size(max = 4) String password) {
    }
}

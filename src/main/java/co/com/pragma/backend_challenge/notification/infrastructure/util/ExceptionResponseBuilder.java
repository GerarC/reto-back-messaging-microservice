package co.com.pragma.backend_challenge.notification.infrastructure.util;

import co.com.pragma.backend_challenge.notification.infrastructure.configuration.advisor.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ExceptionResponseBuilder {
    private ExceptionResponseBuilder(){
        throw new IllegalStateException("Utility class");
    }

    public static ResponseEntity<ExceptionResponse> buildResponse(RuntimeException e, HttpStatus status) {
        ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .statusCode(status.value())
                .status(status)
                .timestamp(LocalDateTime.now())
                .message(e.getMessage()).build();
        return ResponseEntity.status(exceptionResponse.getStatusCode()).body(exceptionResponse);
    }
}

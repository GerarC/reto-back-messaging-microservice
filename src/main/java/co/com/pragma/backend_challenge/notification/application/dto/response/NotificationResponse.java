package co.com.pragma.backend_challenge.notification.application.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationResponse {
    private boolean sent;
    private String message;
}

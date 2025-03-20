package co.com.pragma.backend_challenge.notification.application.dto.request;

import co.com.pragma.backend_challenge.notification.application.util.AppConstants;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationRequest {
    @NotNull(message = AppConstants.RECEIVER_FIELD_MUST_NOT_BE_NULL)
    private String receiver;
    @NotNull(message = AppConstants.MESSAGE_FIELD_MUST_NOT_BE_NULL)
    private String message;
}

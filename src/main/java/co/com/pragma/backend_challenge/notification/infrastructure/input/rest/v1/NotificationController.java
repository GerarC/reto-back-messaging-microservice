package co.com.pragma.backend_challenge.notification.infrastructure.input.rest.v1;

import co.com.pragma.backend_challenge.notification.application.dto.request.NotificationRequest;
import co.com.pragma.backend_challenge.notification.application.dto.response.NotificationResponse;
import co.com.pragma.backend_challenge.notification.application.handler.NotificationHandler;
import co.com.pragma.backend_challenge.notification.infrastructure.util.constant.RestConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationHandler notificationHandler;

    @Operation(summary = RestConstants.SWAGGER_SUMMARY_SEND_SMS_NOTIFICATION)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = RestConstants.SWAGGER_CODE_OK,
                    description = RestConstants.SWAGGER_DESCRIPTION_NOTIFICATION_WAS_SENT
            )
    })
    @PostMapping
    public ResponseEntity<NotificationResponse> sendNotification(@RequestBody NotificationRequest request){
        return ResponseEntity.ok(
                notificationHandler.sendNotification(request)
        );
    }
}
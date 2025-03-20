package co.com.pragma.backend_challenge.notification.application.handler;

import co.com.pragma.backend_challenge.notification.application.dto.request.NotificationRequest;
import co.com.pragma.backend_challenge.notification.application.dto.response.NotificationResponse;

public interface NotificationHandler {
    NotificationResponse sendNotification(NotificationRequest request);
}

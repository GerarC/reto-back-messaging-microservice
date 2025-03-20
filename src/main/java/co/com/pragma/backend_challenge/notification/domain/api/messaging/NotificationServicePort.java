package co.com.pragma.backend_challenge.notification.domain.api.messaging;

import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;

public interface NotificationServicePort {
    String sendNotification(Notification notification);
}

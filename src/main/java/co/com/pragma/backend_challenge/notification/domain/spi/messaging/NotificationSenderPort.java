package co.com.pragma.backend_challenge.notification.domain.spi.messaging;

import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;

public interface NotificationSenderPort {
    String sendNotification(Notification notification);
}

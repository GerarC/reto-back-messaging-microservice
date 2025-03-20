package co.com.pragma.backend_challenge.notification.domain.usecase.messaging;

import co.com.pragma.backend_challenge.notification.domain.api.messaging.NotificationServicePort;
import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;
import co.com.pragma.backend_challenge.notification.domain.spi.messaging.NotificationSenderPort;

public class NotificationUseCase implements NotificationServicePort {
    private final NotificationSenderPort notificationSenderPort;

    public NotificationUseCase(NotificationSenderPort notificationSenderPort) {
        this.notificationSenderPort = notificationSenderPort;
    }

    @Override
    public String sendNotification(Notification notification) {
        return notificationSenderPort.sendNotification(notification);
    }
}

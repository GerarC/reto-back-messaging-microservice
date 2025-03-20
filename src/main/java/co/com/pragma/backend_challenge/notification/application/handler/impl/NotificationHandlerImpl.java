package co.com.pragma.backend_challenge.notification.application.handler.impl;

import co.com.pragma.backend_challenge.notification.application.dto.request.NotificationRequest;
import co.com.pragma.backend_challenge.notification.application.dto.response.NotificationResponse;
import co.com.pragma.backend_challenge.notification.application.handler.NotificationHandler;
import co.com.pragma.backend_challenge.notification.application.mapper.request.NotificationRequestMapper;
import co.com.pragma.backend_challenge.notification.application.util.AppConstants;
import co.com.pragma.backend_challenge.notification.domain.api.messaging.NotificationServicePort;
import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationHandlerImpl implements NotificationHandler {
    private final NotificationServicePort notificationServicePort;
    private final NotificationRequestMapper notificationRequestMapper;
    @Override
    public NotificationResponse sendNotification(NotificationRequest request) {
        Notification notification = notificationRequestMapper.toDomain(request);
        notificationServicePort.sendNotification(notification);
        return NotificationResponse.builder()
                .sent(true)
                .message(AppConstants.DEFAULT_MESSAGE)
                .build();
    }
}

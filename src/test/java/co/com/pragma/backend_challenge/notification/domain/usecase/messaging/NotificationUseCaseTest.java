package co.com.pragma.backend_challenge.notification.domain.usecase.messaging;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;
import co.com.pragma.backend_challenge.notification.domain.spi.messaging.NotificationSenderPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class NotificationUseCaseTest {

    @Mock
    private NotificationSenderPort notificationSenderPort;

    @InjectMocks
    private NotificationUseCase notificationUseCase;

    private static final String RECEIVER = "test@example.com";
    private static final String MESSAGE = "Test notification message";
    private static final String RESPONSE = "Notification sent successfully";

    private static final Notification mockNotification = Notification.builder()
            .receiver(RECEIVER)
            .message(MESSAGE)
            .build();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendNotification_Success() {
        when(notificationSenderPort.sendNotification(any())).thenReturn(RESPONSE);

        String result = notificationUseCase.sendNotification(mockNotification);

        assertEquals(RESPONSE, result);
        verify(notificationSenderPort).sendNotification(mockNotification);
    }
}
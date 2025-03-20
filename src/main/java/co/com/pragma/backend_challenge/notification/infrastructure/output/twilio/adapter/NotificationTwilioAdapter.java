package co.com.pragma.backend_challenge.notification.infrastructure.output.twilio.adapter;

import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;
import co.com.pragma.backend_challenge.notification.domain.spi.messaging.NotificationSenderPort;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationTwilioAdapter implements NotificationSenderPort {

    @Value("${twilio.phone_number}")
    private String phoneNumber;

    @Override
    public String sendNotification(Notification notification) {
        Message message = Message.creator(
                new PhoneNumber(notification.getReceiver()),
                new PhoneNumber(phoneNumber),
                notification.getMessage()
        ).create();
        return message.getAccountSid();
    }
}

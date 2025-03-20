package co.com.pragma.backend_challenge.notification.application.mapper.request;

import co.com.pragma.backend_challenge.notification.application.dto.request.NotificationRequest;
import co.com.pragma.backend_challenge.notification.domain.model.messaging.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationRequestMapper {
    Notification toDomain(NotificationRequest notificationRequest);
}

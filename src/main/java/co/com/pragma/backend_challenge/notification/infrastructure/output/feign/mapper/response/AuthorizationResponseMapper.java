package co.com.pragma.backend_challenge.notification.infrastructure.output.feign.mapper.response;

import co.com.pragma.backend_challenge.notification.domain.model.security.AuthorizedUser;
import co.com.pragma.backend_challenge.notification.domain.util.annotation.Generated;
import co.com.pragma.backend_challenge.notification.infrastructure.output.feign.dto.response.AuthorizationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorizationResponseMapper {

    AuthorizedUser toDomain(AuthorizationResponse response);
    List<AuthorizedUser> toDomains(List<AuthorizationResponse> responses);
}

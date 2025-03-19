package co.com.pragma.backend_challenge.messaging.domain.spi.security;

import co.com.pragma.backend_challenge.messaging.domain.model.security.AuthorizedUser;

public interface AuthorizationSecurityPort {
    AuthorizedUser authorize(String token);
}

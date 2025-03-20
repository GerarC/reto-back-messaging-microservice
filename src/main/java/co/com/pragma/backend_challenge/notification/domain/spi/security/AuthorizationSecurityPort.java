package co.com.pragma.backend_challenge.notification.domain.spi.security;

import co.com.pragma.backend_challenge.notification.domain.model.security.AuthorizedUser;

public interface AuthorizationSecurityPort {
    AuthorizedUser authorize(String token);
}

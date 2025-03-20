package co.com.pragma.backend_challenge.notification.domain.api.security;

import co.com.pragma.backend_challenge.notification.domain.model.security.AuthorizedUser;

public interface AuthorizationServicePort {
    AuthorizedUser authorize(String token);
}

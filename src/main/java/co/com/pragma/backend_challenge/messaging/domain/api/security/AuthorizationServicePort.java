package co.com.pragma.backend_challenge.messaging.domain.api.security;

import co.com.pragma.backend_challenge.messaging.domain.model.security.AuthorizedUser;

public interface AuthorizationServicePort {
    AuthorizedUser authorize(String token);
}

package co.com.pragma.backend_challenge.messaging.domain.usecase.security;

import co.com.pragma.backend_challenge.messaging.domain.api.security.AuthorizationServicePort;
import co.com.pragma.backend_challenge.messaging.domain.exception.NotAuthorizedException;
import co.com.pragma.backend_challenge.messaging.domain.model.security.AuthorizedUser;
import co.com.pragma.backend_challenge.messaging.domain.spi.security.AuthorizationSecurityPort;

public class AuthorizationUseCase implements AuthorizationServicePort {
    private final AuthorizationSecurityPort authorizationSecurityPort;

    public AuthorizationUseCase(AuthorizationSecurityPort authorizationSecurityPort) {
        this.authorizationSecurityPort = authorizationSecurityPort;
    }

    @Override
    public AuthorizedUser authorize(String token) {
        try{
            return authorizationSecurityPort.authorize(token);
        } catch (Exception e){
            throw new NotAuthorizedException();
        }
    }
}

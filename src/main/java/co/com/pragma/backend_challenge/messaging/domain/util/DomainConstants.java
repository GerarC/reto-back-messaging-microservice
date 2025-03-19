package co.com.pragma.backend_challenge.messaging.domain.util;

import co.com.pragma.backend_challenge.messaging.domain.util.annotation.Generated;

import java.util.List;

@Generated
public class DomainConstants {

    private DomainConstants() {
        throw new IllegalStateException("Utility Class");
    }

    // STUFF
    public static final String TOKEN_PREFIX = "Bearer ";

    // Error messages
    public static final String ENTITY_NOT_FOUND_TEMPLATE_MESSAGE = "Entity of type '%s' with id '%s' has not been found";
    public static final String NOT_AUTHORIZED_ERROR_MESSAGE = "User has not authorization over the action";
}

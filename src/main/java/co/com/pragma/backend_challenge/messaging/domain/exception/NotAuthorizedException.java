package co.com.pragma.backend_challenge.messaging.domain.exception;

import co.com.pragma.backend_challenge.messaging.domain.util.DomainConstants;

public class NotAuthorizedException extends RuntimeException {
    public NotAuthorizedException() {
        super(DomainConstants.NOT_AUTHORIZED_ERROR_MESSAGE);
    }
}

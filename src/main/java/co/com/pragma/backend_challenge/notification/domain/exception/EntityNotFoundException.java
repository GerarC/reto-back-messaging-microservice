package co.com.pragma.backend_challenge.notification.domain.exception;


import co.com.pragma.backend_challenge.notification.domain.util.DomainConstants;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String className, String id){
        super(String.format(
                DomainConstants.ENTITY_NOT_FOUND_TEMPLATE_MESSAGE,
                className,
                id
        ));
    }
}

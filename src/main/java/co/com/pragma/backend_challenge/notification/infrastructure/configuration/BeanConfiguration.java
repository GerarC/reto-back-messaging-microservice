package co.com.pragma.backend_challenge.notification.infrastructure.configuration;

import co.com.pragma.backend_challenge.notification.domain.api.messaging.NotificationServicePort;
import co.com.pragma.backend_challenge.notification.domain.api.security.AuthorizationServicePort;
import co.com.pragma.backend_challenge.notification.domain.spi.messaging.NotificationSenderPort;
import co.com.pragma.backend_challenge.notification.domain.spi.security.AuthorizationSecurityPort;
import co.com.pragma.backend_challenge.notification.domain.usecase.messaging.NotificationUseCase;
import co.com.pragma.backend_challenge.notification.domain.usecase.security.AuthorizationUseCase;
import co.com.pragma.backend_challenge.notification.domain.util.annotation.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Generated
@Configuration
public class BeanConfiguration {
    @Bean
    public NotificationServicePort notificationServicePort(NotificationSenderPort notificationSenderPort) {
        return new NotificationUseCase(notificationSenderPort);
    }

    @Bean
    public AuthorizationServicePort authorizationServicePort(
            AuthorizationSecurityPort authorizationSecurityPort
    ) {
        return new AuthorizationUseCase(authorizationSecurityPort);
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        return daoAuthenticationProvider;
    }
}

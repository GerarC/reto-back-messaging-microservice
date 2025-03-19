package co.com.pragma.backend_challenge.messaging.infrastructure.configuration;

import co.com.pragma.backend_challenge.messaging.domain.api.security.AuthorizationServicePort;
import co.com.pragma.backend_challenge.messaging.domain.spi.security.AuthorizationSecurityPort;
import co.com.pragma.backend_challenge.messaging.domain.usecase.security.AuthorizationUseCase;
import co.com.pragma.backend_challenge.messaging.domain.util.annotation.Generated;
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

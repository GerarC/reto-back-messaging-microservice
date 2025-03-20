package co.com.pragma.backend_challenge.notification.infrastructure.output.feign.dto.response;


import co.com.pragma.backend_challenge.notification.domain.util.enums.RoleName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthorizationResponse {
    private String token;
    private RoleName role;
    private String id;
}

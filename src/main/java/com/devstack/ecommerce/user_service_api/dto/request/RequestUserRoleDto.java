package com.devstack.ecommerce.user_service_api.dto.request;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestUserRoleDto {
    private String roleName;
}

package com.devstack.ecommerce.user_service_api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;
    
    @Column(name = "username", nullable = false, unique = true, length = 100)
    private String username;

    @Column(name = "first_name", length = 50, nullable = false)    
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "active_state", columnDefinition = "TINYINT", nullable = false)
    private boolean activeState;

    @Column(name = "otp", nullable = false)
    private int otp;
}

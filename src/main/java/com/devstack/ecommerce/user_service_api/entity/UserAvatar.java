package com.devstack.ecommerce.user_service_api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
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
@Embeddable
@Table(name = "user_avatar")
public class UserAvatar {
    @Id
    @Column(name = "avatar_id", nullable = false, unique = true)
    private String avatarId;

    @Embedded
    private FileResource fileResource;

}

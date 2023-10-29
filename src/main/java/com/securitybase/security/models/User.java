package com.securitybase.security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="UserTable")
public class User {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

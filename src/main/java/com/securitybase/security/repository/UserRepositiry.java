package com.securitybase.security.repository;

import com.securitybase.security.models.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositiry extends JpaRepository<CustomUser, Integer> {
    Optional<CustomUser> findByEmail(String email);
}

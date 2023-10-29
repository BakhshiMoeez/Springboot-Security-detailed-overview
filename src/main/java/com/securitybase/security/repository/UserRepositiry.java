package com.securitybase.security.repository;

import com.securitybase.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositiry extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}

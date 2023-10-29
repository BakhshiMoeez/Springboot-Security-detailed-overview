package com.securitybase.security.config;

import com.securitybase.security.repository.UserRepositiry;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    @Autowired
    private UserRepositiry userRepositiry;
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> userRepositiry.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }
}

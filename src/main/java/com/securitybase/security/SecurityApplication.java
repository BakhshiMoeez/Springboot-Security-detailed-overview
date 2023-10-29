package com.securitybase.security;

import com.securitybase.security.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initData(UserRepository userRepository) {
//		return (args) -> {
//			// Add data to the User table here
//			User user1 = User.builder()
//					.firstName("John")
//					.lastName("Doe")
//					.email("john.doe@example.com")
//					.password("password123")
//					.build();
//
//			User user2 = User.builder()
//					.firstName("Jane")
//					.lastName("Doe")
//					.email("jane.doe@example.com")
//					.password("password456")
//					.build();
//
//			userRepository.save(user1);
//			userRepository.save(user2);
//		};
//	}
}

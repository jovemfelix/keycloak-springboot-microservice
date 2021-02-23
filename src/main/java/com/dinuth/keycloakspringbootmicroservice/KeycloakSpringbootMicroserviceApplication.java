package com.dinuth.keycloakspringbootmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// https://stackoverflow.com/questions/30761253/remove-using-default-security-password-on-spring-boot
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KeycloakSpringbootMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakSpringbootMicroserviceApplication.class, args);
    }

}

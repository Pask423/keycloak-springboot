package org.pcs.springboot.keycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(Authentication authentication) {
        final String body = "Hello " + authentication.getName() + " from Spring Boot 3 by Pask423";
        return ResponseEntity.ok(body);
    }
}

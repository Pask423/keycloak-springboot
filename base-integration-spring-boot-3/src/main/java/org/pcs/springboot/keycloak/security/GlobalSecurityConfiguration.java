package org.pcs.springboot.keycloak.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class GlobalSecurityConfiguration {

    private final KeycloakJwtTokenConverter keycloakJwtTokenConverter;

    public GlobalSecurityConfiguration(TokenConverterProperties properties) {
        JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter
                = new JwtGrantedAuthoritiesConverter();
        this.keycloakJwtTokenConverter
                = new KeycloakJwtTokenConverter(
                        jwtGrantedAuthoritiesConverter,
                        properties);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(customizer -> customizer.anyRequest().authenticated())
                .oauth2ResourceServer(customizer -> customizer
                        .jwt(jwtCustomizer -> jwtCustomizer.jwtAuthenticationConverter(keycloakJwtTokenConverter)))
                .sessionManagement(customizer -> customizer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }
}
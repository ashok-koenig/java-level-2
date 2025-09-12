package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf( csrf -> csrf.disable())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/api", "/api/public").permitAll()
                        .requestMatchers("/api/admin").hasRole("ADMIN")
                        .requestMatchers("/api/user").hasRole("USER")
                        .requestMatchers("/api/protected").hasAnyRole("ADMIN", "USER")
                        .anyRequest().authenticated()
                ).httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

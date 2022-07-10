package com.example.wt.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {
 		
	@Bean
	protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.cors(Customizer.withDefaults());
		http.csrf().disable();
		return http.build();
	}	
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.addAllowedOrigin("http://localhost:3000");
        configuration.addAllowedHeader(CorsConfiguration.ALL);
        configuration.addAllowedMethod(CorsConfiguration.ALL);
        configuration.setAllowCredentials(true);
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
		}
	}

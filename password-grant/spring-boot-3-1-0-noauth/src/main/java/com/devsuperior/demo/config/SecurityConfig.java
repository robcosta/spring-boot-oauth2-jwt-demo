package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//Desabilita ataque do tipo csrf uma vez que api's restfull não guardam dados de sessão.
		http.csrf(csrf -> csrf.disable());
		
		//Controle de acesso global - Libera permissão para todos os endpoints.
		//Nossas restrições de acesso serão trabalhadas individualmente através de controle a nível de rota.
		http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
		return http.build();
	}

}

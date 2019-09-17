package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Credentials;

@Configuration
public class AppConfig {

	@Bean
	public Credentials credentials() {
		return new Credentials();
	}
}

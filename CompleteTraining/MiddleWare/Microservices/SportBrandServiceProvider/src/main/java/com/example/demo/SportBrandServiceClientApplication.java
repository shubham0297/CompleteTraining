package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class SportBrandServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportBrandServiceClientApplication.class, args);
	}

	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}

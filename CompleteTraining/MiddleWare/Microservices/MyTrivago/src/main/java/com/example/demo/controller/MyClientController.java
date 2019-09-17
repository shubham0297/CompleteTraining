package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient client;
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@GetMapping("/find/{location}")
	public String getHotels(@PathVariable("location") String loc) {
		ServiceInstance serviceInstance = client.choose("hotel-service");
//		
		String baseURL=serviceInstance.getUri().toString();
		System.out.println(baseURL);
		baseURL = baseURL+"/find/"+loc;
		String response = template.getForObject(baseURL,String.class);
		return response ;
	}
	
	
}

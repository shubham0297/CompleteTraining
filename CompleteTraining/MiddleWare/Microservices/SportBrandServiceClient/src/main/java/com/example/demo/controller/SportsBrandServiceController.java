package com.example.demo.controller;
//import ItemServiceDB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Items;

@RestController
public class SportsBrandServiceController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient client;
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@GetMapping("/items")
	public String getItems() {
		ServiceInstance serviceInstance = client.choose("sport-item-provider-service");		
		String baseURL=serviceInstance.getUri().toString();
//		System.out.println(baseURL);
		baseURL = baseURL+"/items";
		String response = template.getForObject(baseURL,String.class);
		return response ;
	}

	@GetMapping("/items/{id}")
	public String getItemsById(@PathVariable("id") long id) {
		ServiceInstance serviceInstance = client.choose("sport-item-provider-service");		
		String baseURL=serviceInstance.getUri().toString();
//		System.out.println(baseURL);
		baseURL = baseURL+"/items/"+id;
		String response = template.getForObject(baseURL,String.class);
		return response ;
	}

//	@DeleteMapping("/deleteItem/{id}")
//	public String deleteItemById(@PathVariable("id") long id) {
//		ServiceInstance serviceInstance = client.choose("sport-item-provider-service");		
//		String baseURL=serviceInstance.getUri().toString();
//		System.out.println(baseURL);
//		baseURL = baseURL+"/deleteItem/"+id;
//		String response = template.getForObject(baseURL,String.class);
//		return baseURL ;
//	}

}

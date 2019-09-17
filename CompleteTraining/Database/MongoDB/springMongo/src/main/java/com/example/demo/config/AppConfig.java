package com.example.demo.config;

import java.util.Arrays;

import javax.xml.ws.soap.Addressing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.demo.model.Car;
import com.example.demo.repo.Address;
import com.example.demo.repo.Dealer;
import com.example.demo.repo.Owner;
import com.mongodb.MongoClient;

@Configuration
public class AppConfig {

	@Bean
	public MongoClient client() {
		return new MongoClient("localhost");
	}
	
	@Bean
	public MongoTemplate template() {
		return new MongoTemplate(client(),"training");					// Paramenters ...mongoClient and Database name
	}
	
	@Bean
	public Owner owner() {
		return new Owner(21,"Shubham",address());
	}
	
	@Bean
	public Address address() {
		return new Address("Chennai",600089);
	}
	
	@Bean
	public Dealer dealer() {
		Dealer dealer = new Dealer();
		dealer.setId(455L);
		dealer.setDealerName("Swarup");
		return dealer;
	}
	
	@Bean
	public Car car() {
		Car c = new Car();
		c.setBrand("Hyundai");
		c.setModel(Arrays.asList("i10","i20","accent"));
		c.setOwner(owner());
		c.setDealer(dealer());
	
		
//		byte[] bytes = 
//		c.setId(new ObjectId(bytes));
		return c;
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Catalog;
import com.example.demo.service.CatalogService;

@SpringBootApplication
public class CassandraUsingRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CassandraUsingRepoApplication.class, args);
	    CatalogService service = ctx.getBean(CatalogService.class);
	    Catalog item = ctx.getBean(Catalog.class);
	    Catalog saved = service.add(item); 
	    System.out.println("One catalog with details added successfully :- " +saved);
	    ctx.close();
	}

	@Bean
	public Catalog catalog() {
		return new Catalog(104,"Broadband","20 Days",200.67);
	}
}

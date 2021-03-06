package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Items;

import com.example.demo.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping(value="/items")
	public List<Items> getAll(){
		return (List<Items>) this.service.findall();
	}
	
	
	@PostMapping(value="/items",produces="application/json",consumes="application/json")
	public Items add(@RequestBody Items entity) {
		return this.service.save(entity);
	}
	
	@GetMapping(value="/items/{id}")
	public Optional<Items> getSingleItem(@PathVariable("id") long id){
		return service.getById(id);
	}
	
}

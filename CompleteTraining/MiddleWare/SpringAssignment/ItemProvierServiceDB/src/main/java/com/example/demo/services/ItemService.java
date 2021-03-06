package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Items;

import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	public Items save(Items entity) {
		return repo.save(entity);
	}
	
	public List<Items> findall()
	{
		return (List<Items>) repo.findAll();
	}
	
	public Optional<Items> getById(Long id){
		return repo.findById(id);
	}
}

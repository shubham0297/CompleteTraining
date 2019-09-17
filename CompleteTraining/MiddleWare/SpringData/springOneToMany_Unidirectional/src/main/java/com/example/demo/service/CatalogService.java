package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Catalog;

@Service
public class CatalogService {

	@Autowired
	private CrudRepository<Catalog, Long> repo;
	
	public Catalog addCatalog(Catalog entity) {
		return  this.repo.save(entity);
	}
	
	public Iterable<Catalog> findAll(){
		return this.repo.findAll();
	}
}

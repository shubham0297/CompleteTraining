package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Catalog;

@Service
public class CatalogService {

	@Autowired 
	CrudRepository<Catalog, Integer> repo;				// Abstraction...using super class ...if we use CassandraRepo. it is fixed...if in future something changes and we use Mysql we will have to change the code. By using Crud. we will not as Mysql extends crud.
	
	public Iterable<Catalog> findAll(){
		return this.repo.findAll();
	}
	
	public Catalog add(Catalog entity) {
		return this.repo.save(entity);
	}
}

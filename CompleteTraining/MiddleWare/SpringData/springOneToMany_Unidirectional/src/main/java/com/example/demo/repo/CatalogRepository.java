package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Catalog;

public interface CatalogRepository extends CrudRepository<Catalog, Long> {

}

package com.example.demo.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.model.Catalog;

public interface CatalogRepository extends CassandraRepository<Catalog, Integer> {

}

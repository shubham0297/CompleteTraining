package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Items;

public interface ItemRepository extends CrudRepository<Items, Long> {

}

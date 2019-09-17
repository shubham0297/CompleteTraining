package com.example.demo.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.repo.Dealer;
import com.example.demo.repo.Owner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="cars")						// Like @Entity...and cars is a 
@NoArgsConstructor
@AllArgsConstructor 
@Data
public class Car {

	@Id
	private ObjectId id;				// Instead of long we can write ObjectId ...it is used if no field has unique values
	private String brand;
	private List<String> model;
	private Owner owner;
	
	@DBRef(lazy = true)
	private Dealer dealer;
}

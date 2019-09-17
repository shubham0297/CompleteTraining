package com.example.demo.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(value="catalog")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catalog {

	@PrimaryKey
	private int id;
	
	@Column(value="catalog_name")
	private String catalogName;
	private String validity;
	private double amount;
	
}

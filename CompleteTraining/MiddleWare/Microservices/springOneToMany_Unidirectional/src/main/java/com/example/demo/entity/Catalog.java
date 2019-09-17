package com.example.demo.entity;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vayutel_catalog")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catalog {
	
	@Id
	@GeneratedValue
	private long catalogId;
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "catalog_ref")
	private Set<Plan> plans ; 
}

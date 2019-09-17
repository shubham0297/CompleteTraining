package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="sport_items")
public class Items {

	@Id
	private long itemId;
	private String itemName;
	private double itemPrice;
}








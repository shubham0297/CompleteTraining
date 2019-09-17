package com.example.demo.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Owner {

	private long id;
	private String userName;
	private Address billingAddress;
}

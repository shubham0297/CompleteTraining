package com.training.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {

	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String password;
	
	@Email
	private String email;
}


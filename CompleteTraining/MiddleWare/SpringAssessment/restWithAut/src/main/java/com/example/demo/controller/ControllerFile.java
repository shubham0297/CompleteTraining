package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Credentials;


@RestController
public class ControllerFile {
	
	@Autowired
	Credentials credentials;
	
	
	// CHECK THE FUNCTION USING POSTMAN ----> METHOD = POST  --->  URL = http://localhost:8085/message 
	// BODY--> RAW--> JSON 
	// DEFAULT USERNAME= "India"         PASSWORD="India"
	@PostMapping(value="/message",produces="application/String",consumes="application/json")
	public String displayMessage(@RequestBody Credentials cred) {
		String message = "Invalid User";
		if(cred.getUsername().equals("India") && cred.getPass().equals("India"))
		{
			message = "Valid User";
		}
		return message;
	}
}

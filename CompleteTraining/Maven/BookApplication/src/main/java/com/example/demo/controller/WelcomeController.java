package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/book")
public class WelcomeController {

	@GetMapping("/heading")
	public String greet() {
		return "Gandhi Library";
	}
}

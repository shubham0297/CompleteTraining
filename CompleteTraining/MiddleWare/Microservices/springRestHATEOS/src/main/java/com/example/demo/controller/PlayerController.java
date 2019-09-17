package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Players;
import com.example.demo.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;
	

	@GetMapping("/all")
	public Iterable<Players> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("getAll/{pageNo}/{pageSize}/{sortBy}/{club}")
	public Iterable<Players> findByRating(
			@PathVariable("club") String club,
			@PathVariable("pageNo") Integer pageNo,
			@PathVariable("pageSize") Integer pageSize,
			@PathVariable("sortBy") String sortBy) {

			Iterable<Players> list = service.getByPlayerClub(pageNo,
			pageSize, sortBy,club);

			return list;
	}
}

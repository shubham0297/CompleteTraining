package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.MyService;

@Controller
public class SportsController {

		@Autowired
		MyService service;
		
		// METHOD-1
		@GetMapping("/sports")
		public String getSports(Model model) {
		
			 List<Map<String, Object>> data = service.getSportItem();
			 model.addAttribute("sportList",data);			//payment list is the key in showPayments name...through which we can access data in showPayments.jsp file
			 return "showSports";								// This is the viewName
		}
}
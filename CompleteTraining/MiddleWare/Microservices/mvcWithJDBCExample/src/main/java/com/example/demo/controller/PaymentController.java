package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.MyService;

@Controller
public class PaymentController {

		@Autowired
		MyService service;
		
		// METHOD-1
		@GetMapping("/payments")
		public String getPayments(Model model) {
		
			 List<Map<String, Object>> data = service.getAllPayments();
			 model.addAttribute("paymentList",data);			//payment list is the key in showPayments name...through which we can access data in showPayments.jsp file
			 return "showPayments";								// This is the viewName
		}
		
		
		// METHOD -2 		Both are same --> THis is using modelAndView...need to register bean
		@Autowired
		ModelAndView mdlview;
		
		
		@GetMapping("/allPayments")
		public ModelAndView getAllPayments() {
			 List<Map<String, Object>>  data = service.getAllPayments();
			 mdlview.addObject("paymentList",data);
			 mdlview.setViewName("showPayments");
			 return mdlview;
		}
}

package com.training.controllers;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.training.models.User;

@Controller

public class UserController {

	@Autowired
	private User user;
	
	@Autowired
	private ModelAndView mdlview;
	
	
	private HashMap<String,String> credentials = new HashMap<String, String>();
	
	@GetMapping("/registerUser")
	public ModelAndView initForm1()
	{
		mdlview.setViewName( "registration");
		mdlview.addObject("command", user);
		return mdlview;
	}
	
	
	@PostMapping("/registerUser")
	public String onSubmit(@ModelAttribute("command")User user,BindingResult result)  
	{
		
		credentials.put(user.getUserName(), user.getPassword());
		String nextPage="login";
		
		if(result.hasErrors())
		{
			System.out.println(user.getUserName());
			nextPage="failure";
		}
				return nextPage;
		
	}
	
	@PostMapping("/login")
	public String onlogin(@ModelAttribute("command")User user,BindingResult result)  
	{
	
		String nextPage="failure";;
		if(credentials.get(user.getUserName()).equals("India"))
		{
			nextPage="success";
		}
		return nextPage;
	}
}

package com.training.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.UserDetails;



@Controller
public class UserController {

	@Autowired
	private ModelAndView user;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/registerUser")
	public ModelAndView initForm() {
		mdlView.setViewName("registration");
		mdlView.addObject("command", user);
		return mdlView;
	}
	
	
	@PostMapping("/registerUser")
	public String onSubmit(@Valid @ModelAttribute("command") UserDetails user,BindingResult result){
		Map<String,String> credentials = new HashMap<String, String>();
		credentials.put(user.getUserName(), user.getPassword());
		return "login";
	}
	
	@PostMapping("/validateUser")
	public String onLoginSubmit(@Valid @ModelAttribute("command") UserDetails user,BindingResult result){
		String nextPage="success";
		if(result.hasErrors())
		{
			nextPage= "failure";
		}
		return nextPage;
	}
	
//	@ModelAttribute("depts")
//	public String[] departments() {
//		return new String[] {"ENT","Dental","Eye","Nose"};
//	}

}

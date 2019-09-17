package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@RestController
public class PaymentController {

	
	@Autowired
	private PaymentService service;
	
	
	@PostMapping(value="/postPayments",produces="application/json",consumes="application/json")
	public Payment add(@RequestBody Payment entity) {
		return this.service.save(entity);
	}
	
	@GetMapping(value="/payment")
	public List<Payment> getAll(){
		return (List<Payment>) this.service.findall();
	}
	@RequestMapping(value="/deletePayment/{id}" ,method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("id") long tid){
		return this.service.deletePayment(tid);

	}
}

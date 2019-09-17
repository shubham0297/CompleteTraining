package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	
	public Payment save(Payment entity) {
		return repo.save(entity);
	}
	
	public List<Payment> findall()
	{
		return (List<Payment>) repo.findAll();
	}
	
	public String deletePayment(long id) 
	{
		String msg = "ITEM NOT FOUND";
		if(repo.findById(id)!=null)
		 {
			repo.deleteById(id);
			msg = "ITEM SUCCESSFULLY DELETED";
		 }
		return msg;
	}
	
}

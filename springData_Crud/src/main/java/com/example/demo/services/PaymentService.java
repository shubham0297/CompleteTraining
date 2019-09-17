package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repos.PaymentRepository;

@Service
public class PaymentService {

	
//	private PaymentRepository repo;  This is not used as it will autowire the repo to only PaymentRepo.  So we use super set CrudRepository 
//  if multiple repositry are extending Crud Repository we can use "Qualifier="CashRepository"
//  Now when we use CrudRepository ...it will autowire the repo which has @Repository annotaion...if more than one have @Annotaion, we can use @Qualifier("PaymentRepo") below @Autowire
	
	// IN SHORT -- if we use @Autowire PaymentService -- it will only inject bean of type Payment Service
	// By writing CrudReposotory ..all the interfaces are available to be injected as bean...The one repository with @Repository will get injected.
	// iF multiple @Repository present.....then we use @Autowire@Qualifier("nameOfRepositoryToInject")
	@Autowired
	private CrudRepository<Payment, Long> repo;
	
	
	public Iterable<Payment> findAll(){
		return this.repo.findAll();
	}
	
	public List<Payment> searchByCustomerName(String name) {
		PaymentRepository paymentRepo = (PaymentRepository)repo;
		return paymentRepo.findByCustomerName(name);
	}
	
	public List<Payment> searchByNameAndAmount(String name,double amount){
		PaymentRepository paymentRepo = (PaymentRepository)repo;
		return paymentRepo.findByCustomerNameAndTxnAmount(name, amount);
	}
}

package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;

@Service
public class MyService {

	@Autowired
	private JdbcTemplate template;
	
	
	@Autowired
	private JdbcTemplate template2;
	 
	public List<Map<String, Object>> getAllPayments(){
		String sql_query = "Select * from vdsi_payment";
		return template.queryForList(sql_query);
		
	}
	
	public List<Map<String, Object>> getSportItem(){
		String sql_query = "Select * from sport_items";
		return template.queryForList(sql_query);
		
	}
	
}

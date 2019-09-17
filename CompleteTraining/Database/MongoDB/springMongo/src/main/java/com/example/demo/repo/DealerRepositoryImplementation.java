package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class DealerRepositoryImplementation  implements RepositoryTemplate<Dealer> {

	@Autowired
	private MongoTemplate template;
	
	@Override
	public Dealer save(Dealer t) {
		// TODO Auto-generated method stub
		return template.save(t);
	}

	@Override
	public List<Dealer> findAll() {
		// TODO Auto-generated method stub
		return template.findAll(Dealer.class);
	}

	@Override
	public long remove(Dealer t) {
		// TODO Auto-generated method stub
		return template.remove(t).getDeletedCount();
	}

}

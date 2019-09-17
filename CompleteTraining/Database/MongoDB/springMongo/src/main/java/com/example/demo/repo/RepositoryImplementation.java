package com.example.demo.repo;

import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class RepositoryImplementation implements RepositoryTemplate<Car> {

	@Autowired
	private MongoTemplate template;				// We should provide either constructor or setter dependency. Even if we don't the spring itself does.
	
	@Override
	public Car save(Car t) {
		return template.save(t);
	}

	@Override
	public List<Car> findAll() {
		return template.findAll(Car.class);
	}
	@Override
	public long remove(Car t) {
		return template.remove(t).getDeletedCount();
	}

	
}

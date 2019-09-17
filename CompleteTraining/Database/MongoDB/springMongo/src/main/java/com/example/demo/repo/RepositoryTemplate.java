package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;


public interface RepositoryTemplate<T> {

		public T save(T t);
		public List<T> findAll();
		public long remove(T t);
}

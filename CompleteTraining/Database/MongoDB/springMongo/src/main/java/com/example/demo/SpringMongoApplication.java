package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Car;
import com.example.demo.repo.Dealer;
import com.example.demo.repo.DealerRepositoryImplementation;
import com.example.demo.repo.RepositoryImplementation;
import com.example.demo.repo.RepositoryTemplate;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMongoApplication.class, args);
		RepositoryTemplate<Car> repo = ctx.getBean("repositoryImplementation",RepositoryTemplate.class) ;
		Car car = ctx.getBean(Car.class);
		Car saved = repo.save(car);
		
		RepositoryTemplate<Dealer> repo2 = ctx.getBean(DealerRepositoryImplementation.class) ;
		Dealer dealer = ctx.getBean(Dealer.class);
		Dealer saved2 = repo2.save(dealer);
		car.setDealer(saved2);
		repo.save(car);
		System.out.println("One car with Details Saved : " + saved);
		ctx.close();
		
	}
}

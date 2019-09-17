package com.example.demo.rabbit;



import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Publisher {

	@Autowired
	RabbitTemplate template;

	@Autowired
	Queue queue;
	
	long nos = 50;
	int i=1;

	@Scheduled(fixedRate = 1000,initialDelay = 5000)
	public void send() {
		
		log.info(i++ + " Food Order about to be sent");
		template.convertAndSend(queue.getName(),"Vegan Meals - 20 Units");
	
		log.info("One Food order sent.");
		
		nos = nos+20;
	}
}

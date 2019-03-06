package com.simcogno.microservice.interest.manager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AccountMessageListener {
	
	  @Autowired
	  private InterestRepository repository;
	  
	
	  static final Logger logger = LoggerFactory.getLogger(AccountMessageListener.class);

	   @RabbitListener(queues = RabbitConfig.QUEUE_ORDERS)
	   public void processOrder(Account account) {
	       logger.info("Order Received: :)");
	       	       
	       repository.save(account);
	       
	       /*
	       logger.info("Id: " + account.getId());
	       logger.info("Type: " + account.getType());
	       logger.info("BankName: " + account.getBankname());
	       logger.info("InterestRate: " + account.getInterestRate());
	       */
	}
	

}

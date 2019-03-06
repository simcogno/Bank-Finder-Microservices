package com.simcogno.microservice.bank.accounts;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AccountMessageSender {
	
    private final RabbitTemplate rabbitTemplate;
    
    
    @Autowired
    public AccountMessageSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
 
    public void sendOrder(Account account) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, account);
        
        
    }

}

package com.simcogno.microservice.interest.manager;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class InterestManagerController {
	
	  @Autowired
	  private InterestRepository repository;
	
	  @GetMapping("/type/{type}/bankname/{bankname}/amount/{amount}")
	  public Profit convertCurrency(@PathVariable String type, 
			  @PathVariable String bankname,
	      @PathVariable double amount) {

		Account currentAccount = repository.findByTypeAndBankname(type, bankname);  
	    
	    double interestRate = currentAccount.getInterestRate();
	    double interestOfAmount = (amount / 100) * interestRate;
	    double profit = amount + interestOfAmount;

	    return new Profit(type, bankname, interestRate, amount,
	        profit);
	  }

}

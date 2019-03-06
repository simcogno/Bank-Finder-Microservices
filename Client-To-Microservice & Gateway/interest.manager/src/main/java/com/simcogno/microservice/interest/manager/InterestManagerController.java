package com.simcogno.microservice.interest.manager;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class InterestManagerController {
	
	  @GetMapping("/type/{type}/bankname/{bankname}/amount/{amount}")
	  public Profit convertCurrency(@PathVariable String type, 
			  @PathVariable String bankname,
	      @PathVariable double amount) {

	    Map<String, String> uriVariables = new HashMap<>();
	    uriVariables.put("type", type);
	    uriVariables.put("bankname", bankname);

	    ResponseEntity<Profit> responseEntity = new RestTemplate().getForEntity(
	        "http://localhost:7001/type/{type}/bankname/{bankname}", Profit.class,
	        uriVariables);

	    Profit response = responseEntity.getBody();
	    
	    double interestRate = response.getInterestRate();
	    double interestOfAmount = (amount / 100) * interestRate;
	    double profit = amount + interestOfAmount;
	    System.out.println(profit);

	    return new Profit(response.getId(), type, bankname, interestRate, amount,
	        profit);
	  }

}

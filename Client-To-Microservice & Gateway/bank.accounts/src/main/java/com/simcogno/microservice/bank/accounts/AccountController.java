package com.simcogno.microservice.bank.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
  
  
  @Autowired
  private AccountRepository repository;
  
  @GetMapping("/type/{type}/bankname/{bankname}")
  public Account retrieveAccount
    (@PathVariable String type, @PathVariable String bankname){
	      
    Account currentAccount = 
        repository.findByTypeAndBankname(type, bankname);
        

    
    return currentAccount;
  }
}


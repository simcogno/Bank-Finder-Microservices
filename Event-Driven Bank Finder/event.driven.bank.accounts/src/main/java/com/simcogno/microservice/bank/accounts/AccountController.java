package com.simcogno.microservice.bank.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  @Autowired	
  private AccountMessageSender sender;

  @Autowired
  private JPARepository repository;
  
  @GetMapping("/type/{type}/bankname/{bankname}")
  public Account retrieveAccount
    (@PathVariable String type, @PathVariable String bankname){
	      
    Account currentAccount = 
        repository.findByTypeAndBankname(type, bankname);
        
    return currentAccount;
  }
  
  @GetMapping("/insert/type/{type}/bankname/{bankname}/interest/{interest}")
  public Account insertAccount
  (@PathVariable String type, @PathVariable String bankname, @PathVariable double interest){
	      
  Account currentAccount = new Account(1, type, bankname, interest);
  
  repository.save(currentAccount);
  
  currentAccount = repository.findByTypeAndBankname(type, bankname);
  
  
  sender.sendOrder(currentAccount);

  return currentAccount;
}
}


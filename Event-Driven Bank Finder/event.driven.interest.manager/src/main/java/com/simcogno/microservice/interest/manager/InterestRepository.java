package com.simcogno.microservice.interest.manager;

import org.springframework.data.jpa.repository.JpaRepository;


public interface InterestRepository extends JpaRepository<Account, Integer> {
	
  Account findByTypeAndBankname(String type, String bankname);
  
  Account save(Account account);
  
  
}
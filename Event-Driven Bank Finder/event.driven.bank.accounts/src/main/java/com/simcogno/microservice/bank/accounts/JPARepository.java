package com.simcogno.microservice.bank.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARepository extends JpaRepository<Account, Integer> {
	
  Account findByTypeAndBankname(String type, String bankname);
  
  Account save(Account account);
  
  
}
package com.simcogno.microservice.interest.manager;

import javax.persistence.*;

@Entity
public class Account {

	@Id
	private int id;
	
	@Column(name="account_type")
	private String type;
	  
	@Column(name="account_bankname")
	private String bankname;
	  
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(int id, String type, String bankname, double interestRate) {
		
		super();
		this.id = id;
		this.type = type;
		this.bankname = bankname;
		this.interestRate = interestRate;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public String getBankname() {
		return bankname;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	

}

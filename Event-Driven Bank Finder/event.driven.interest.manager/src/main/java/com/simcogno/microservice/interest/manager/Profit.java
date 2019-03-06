package com.simcogno.microservice.interest.manager;

public class Profit {
	
	  private String type;
	  private String bankname;
	  private double interestRate;
	  private double amount;
	  private double profit;

	  public Profit() {

	  }

	  public Profit(String type, String bankname, double interestRate, 
			  double amount, double profit) {
	    super();
	    this.type = type;
	    this.bankname = bankname;
	    this.interestRate = interestRate;
	    this.amount = amount;
	    this.profit = profit;
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
	  
	  public double getAmount() {
		  return amount;
	  }
	  
	  public double getProfit() {
		  return profit;
	  }


	  
}

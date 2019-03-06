package com.simcogno.microservice.interest.manager;

public class Profit {
	  private int id;
	  private String type;
	  private String bankname;
	  private double interestRate;
	  private double amount;
	  private double profit;

	  public Profit() {

	  }

	  public Profit(int id, String type, String bankname, double interestRate, 
			  double amount, double profit) {
	    super();
	    this.id = id;
	    this.type = type;
	    this.bankname = bankname;
	    this.interestRate = interestRate;
	    this.amount = amount;
	    this.profit = profit;
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
	  
	  public double getAmount() {
		  return amount;
	  }
	  
	  public double getProfit() {
		  return profit;
	  }


	  
}

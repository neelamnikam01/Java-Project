package com.capgemini.training.lab4.exercise1.service;

public class SavingAccount extends Account {
	
	private final double minBalance=1000;
	
	public SavingAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(double bal) {
		
		if((super.getBalance()-bal)<this.minBalance)
			System.out.println("Sorry !! Minimun balance should be INR 1000");
		else
			super.setBalance(super.getBalance()-bal);
	}
	
	
	
}

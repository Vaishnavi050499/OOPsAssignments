package com.shristi.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		  if (amount > balance) {
	            System.out.println("Insufficient funds in Savings account.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " from Savings account successful.");
	        }
	    }
	

	@Override
	void deposit(double amount) {
		 balance=balance+amount;
		 System.out.println("Deposit done into savings account");
		
	}
	

}

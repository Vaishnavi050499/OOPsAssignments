package com.shristi.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		  if (amount > (balance+1000)) {
	            System.out.println("Overdraft limit exceeded in Current account ");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " from Current account successful.");
	        }
	    }

	@Override
	void deposit(double amount) {
		 balance=balance+amount;
		 System.out.println("Deposit done into current account");
		
	}
	

}

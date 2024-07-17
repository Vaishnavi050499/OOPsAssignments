package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Welcome to ATM:");
		System.out.println("Please Select the Account type");
		System.out.println("1: Savings Account");
		System.out.println("2: Current Account");

		int option = sc.nextInt();

		System.out.println("Please enter the intial balance");
		double balance = sc.nextDouble();

		switch (option) {
		case 1:
			account = new Savings(balance);
			break;

		case 2:
			account = new Current(balance);
			break;

		default:
			System.out.println("Invalid account type");
			System.exit(0);

		}

		while (true) {

			System.out.println("Welcome to ATM:");
			System.out.println("1:Withdraw Amount");
			System.out.println("2:Deposit Amount");
			System.out.println("3:Check Balance");
			System.out.println("4:Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 2:
				System.out.println("Enter amount to deposit:");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;

			case 3:
				System.out.println(account.getBalance());
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		}
		
	}

}

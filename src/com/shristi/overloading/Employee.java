package com.shristi.overloading;

public class Employee {
	String empname;
	String designation;

	Employee(String empname, String designation) {
		this.empname = empname;
		this.designation = designation;
	}
   
	public void printDetails()
	{
		System.out.println("Employeename---- "+ empname);
		System.out.println("Designation---- "+ designation);
	}
	
	
	double calcBonus(double basicAllowance) {
		return basicAllowance * 0.1;
	}

	double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance * 0.1 + carAllowance * 0.5;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance * 0.1 + carAllowance * 0.5 + houseAllowance * 0.2;
	}
}

package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] employee = new Employee[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Employee" + (i + 1) + "name");
			String emp = sc.nextLine();

			System.out.println("Enter the Employee" + (i + 1) + "Designation");
			String designation1 = sc.nextLine();
		

			double basicallowance=0,carAllowance = 0, houseAllowance = 0;

			employee[i] = new Employee(emp, designation1);

			

			if (designation1.equalsIgnoreCase("Manager") || designation1.equalsIgnoreCase("Director")
					|| designation1.equalsIgnoreCase("Programmer")) {
				System.out.println("Enter the BasicAllowance");
				 basicallowance = sc.nextDouble();
			}
			if (designation1.equalsIgnoreCase("Manager") || designation1.equalsIgnoreCase("Director")) {
				System.out.print("Enter car allowance: ");
				carAllowance = sc.nextDouble();
			}

			if (designation1.equalsIgnoreCase("Director")) {
				System.out.print("Enter house allowance: ");
				houseAllowance = sc.nextDouble();
			}

			
			sc.nextLine();
			
			System.out.println("Employee details with bonus");
			employee[i].printDetails();
			
			if (designation1.equalsIgnoreCase("Programmer")) {
				System.out.println("Bonus is" + employee[i].calcBonus(basicallowance));
			} else if (designation1.equalsIgnoreCase("Manager")) {

				System.out.println("Bonus is" + employee[i].calcBonus(basicallowance, carAllowance));

			} else if (designation1.equalsIgnoreCase("Director")) {

				System.out.println("Bonus is" + employee[i].calcBonus(basicallowance, carAllowance, houseAllowance));

			} else {
				
				System.out.println("Designation is not valid");

			}
		}
		sc.close();

	}
}

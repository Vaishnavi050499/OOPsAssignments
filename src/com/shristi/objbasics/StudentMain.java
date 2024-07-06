package com.shristi.objbasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
//Scanner for student1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter name of student1");
		String name = sc.nextLine();
		System.out.println("Please Enter the Department");
		String dept = sc.nextLine();

		System.out.println("Enter the number of subjects to calculate marks");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter the marks of the students");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		sc.nextLine();
//Scanner for student2	
		System.out.println("Please Enter name of student2");
		String name1 = sc.nextLine();
		System.out.println("Please Enter the Department");
		String dept1 = sc.nextLine();

		System.out.println("Enter the number of subjects to calculate marks");
		int n1 = sc.nextInt();
		int marks1[] = new int[n1];
		System.out.println("Enter the marks of the students");
		for (int i = 0; i < n1; i++) {
			marks1[i] = sc.nextInt();
		}

		Student student1 = new Student(name, dept);
		System.out.println("Details of Student1");
		System.out.println("------------------------");
		student1.printStudentDetails();
		System.out.println("Grade of Student1::" + " " + student1.getGrades(marks));

		System.out.println("------------------------");

		Student student2 = new Student(name1, dept1);
		System.out.println("Details of Student2");
		System.out.println("------------------------");
		student2.printStudentDetails();

		System.out.println("Grade of Student2::" + " " + student2.getGrades(marks1));

		System.out.println("------------------------");

	}

}

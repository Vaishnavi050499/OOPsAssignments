package com.shristi.objbasics;

public class Student {

	
String name;
String dept;

Student(String name,String dept)
{
	this.name=name;
	this.dept=dept;
}
public void printStudentDetails()
{
	System.out.println("StudentName"+ "---"+name);
	System.out.println("Department"+ "---"+dept);
}
int sum=0,avg=0;
String getGrades(int... marks)

{
	int n=marks.length;
	for(int mark:marks)
	{
		sum+=mark;
	}
	avg=sum/n;
	System.out.println("Sum of marks"+ "---"+sum);
	System.out.println("Average of marks"+ "---"+avg);
	if(avg>=90 && avg<=100)
		return " A";
	if(avg>=80 &&  avg<90)
		return "B";
	if(avg>=70 && avg<80)
		return "C";
	if(avg>=60 &&  avg<70)
		return "D";
	if(avg>=50 &&  avg<60)
		return "E";
	
	return "fail";
}
}

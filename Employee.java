package com.edu;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	String ename;
	int eage;
	float esalary;
	String edept;
	double eyearsalary;
	
	Scanner sc = new Scanner(System.in);
	
	//User input
	
	System.out.println("Enter ename");
	ename = sc.next();
	System.out.println("Enter eage");
	eage = sc.nextInt();
	System.out.println("Enter esalary");
	esalary = sc.nextInt();
	System.out.println("Enter edept");
	edept = sc.next();
	
	//Display
	
	System.out.println("Enter the Name:"+ename);
	System.out.println("Enter the Age:"+eage);
	System.out.println("Enter the Salary:"+esalary);
	System.out.println("Enter the Dept:"+edept);
	eyearsalary = esalary*12;
	System.out.println("Calculated one year salary of the employee:"+eyearsalary);
	
	

	}

}

package com.edu;

import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	float esalary;
	String edept;
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("Enter eid");
		eid=sc.nextInt();
		System.out.println("Enter salary");
		esalary=sc.nextFloat();
		System.out.println("Enter dept name");
		edept=sc.next();
	}
	void display() {
		System.out.println("Name="+ename);
		System.out.println("Employee id="+eid);
		System.out.println("Salary="+esalary);
		System.out.println("Department="+edept);
	}
}
public class Student {

	public static void main(String[] args) {
		Employee eob=new Employee();
		Employee eob1=new Employee();
		Employee eob2=new Employee();
		eob.inputData();
		eob1.inputData();
		eob2.inputData();
		eob.display();
		eob1.display();
		eob2.display();

	}

}

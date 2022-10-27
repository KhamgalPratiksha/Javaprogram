package com.edu;

public class Employee {
	int b;
	static int c=10;
	
	void display() {
		int k=0;
		System.out.println("b="+b);
		System.out.println("static data c="+c);
		System.out.println("local variable k="+k);
	}

	public static void main(String[] args) {
		int a=10;
		Employee eob=new Employee();
		System.out.println("b="+eob.b);
		System.out.println("static data c="+Employee.c);
		System.out.println("static data c="+eob.c);
		System.out.println("static data c="+c);

	}

}

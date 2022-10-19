package com.edu;

import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) {
	int age;
	float fees;
	String name;
	char gen;
	
	Scanner sc = new Scanner(System.in);
	//User input
	
	System.out.println("Enter name");
	name=sc.next();
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Enter fees");
	fees=sc.nextFloat();
	System.out.println("Enter gender M/F");
	gen=sc.next().charAt(0);
	
	//Display
	
	System.out.println("Enter the Name:"+name);
	System.out.println("Enter theAge:"+age);
	System.out.println("Enter the Fees:"+fees);
	System.out.println("Enter the Gender:"+gen);


	}

}

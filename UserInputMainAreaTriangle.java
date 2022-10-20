package com.edu;

import java.util.Scanner;

public class UserInputMainAreaTriangle {

	public static void main(String[] args) {
	int base;
	int height;
	float area;
	
	Scanner sc = new Scanner(System.in);
	
	//User input
	
	System.out.println("Enter base");
	base = sc.nextInt();
	System.out.println("Enter height");
	height = sc.nextInt();
	
	 area = (base*height)/2;
	
	//Display
	
	System.out.println("The Area of Triangle="+area);

	}

}

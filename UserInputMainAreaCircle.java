package com.edu;

import java.util.Scanner;
public class UserInputMainAreaCircle {

	public static void main(String[] args) {
	int radius;
	double pi=3.142;
	double area;
	
	Scanner sc = new Scanner(System.in);
	
	//User input
	System.out.println("Enter radius");
	radius = sc.nextInt();
	
	area=pi*radius*radius;
	
	//Display
	
	System.out.println("The Area of circle="+area);
	
			

	}

}

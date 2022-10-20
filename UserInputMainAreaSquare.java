package com.edu;

import java.util.Scanner;

public class UserInputMainAreaSquare {

	public static void main(String[] args) {
	float side,area;
	
	Scanner sc = new Scanner(System.in);
	
	//User input
	
	System.out.println("Enter side");
	side = sc.nextInt();
	
	area = side*side;
	
	//Display
	
	System.out.println("The Area of Square="+area+"sq unit");
	

	}

}

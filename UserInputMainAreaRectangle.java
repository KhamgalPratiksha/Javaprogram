package com.edu;

import java.util.Scanner;

public class UserInputMainAreaRectangle {

	public static void main(String[] args) {
	int len;
	int bre;
	int area;
	
	Scanner sc = new Scanner(System.in);
	
	//User input
	
	System.out.println("Enter length");
	len = sc.nextInt();
	System.out.println("Enter breadth");
	bre = sc.nextInt();
	
	area = len*bre;
	
	//Display
	
	System.out.println("The Area of Rectangle="+area);

	}

}

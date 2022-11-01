package com.edu;

import java.util.Scanner;

public class AreaUsingLoop {

	public static void main(String[] args) {
		float ans;
		int select;
		Scanner sc=new Scanner(System.in);
		System.out.println("************MENU***********");
		System.out.println("Enter your choice");
		System.out.println("1.Rectangle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("4.Circle");
		select=sc.nextInt();
		
		if(select==1) {
			System.out.println("Enter your length");
			float len=sc.nextFloat();
			System.out.println("Enter your breadth");
			float bre=sc.nextFloat();
			ans=len*bre;
			System.out.println("The total area of rectangle is:"+ans);
		}
		else if(select==2) {
			System.out.println("Enter your one side of Square");
			float side=sc.nextFloat();
			ans=side*side;
			System.out.println("The total area of square:"+ans);
		}
		else if(select==3) {
			System.out.println("Enter  your base");
			float base=sc.nextFloat();
			System.out.println("Enter your height");
			float height=sc.nextFloat();
			ans=(base*height)/2;
			System.out.println("The total area of triangle:"+ans);
		}
		else if(select==4) {
			System.out.println("Enter your radius");
			float rad=sc.nextFloat();
			ans=3.14f*rad*rad;
			System.out.println("The total area of circle:"+ans);
		}
	}

}

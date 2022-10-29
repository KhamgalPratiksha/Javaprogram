package com.edu;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("The largest of"+n1+","+n2+" and "+n3+" is "+n1);
		} 
		else if(n2>n1 && n2>n3)
		{
			System.out.println("The largest of"+n1+","+n2+" and "+n3+" is"+n2);
		}
		else
		{
			System.out.println("The largest of"+n1+","+n2+" and "+n3+" is"+n3);
		}
	

	}

}

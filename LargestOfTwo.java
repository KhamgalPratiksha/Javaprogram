package com.edu;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		System.out.println("Enter the second number");
		n2=sc.nextInt();
		
		if(n1==n2)
		{
			System.out.println("Both numbers are equal");
		}
		else if(n1>n2)
		{
			System.out.println(n1+"Is larger than"+n2);
			
		}
		else
		{
			System.out.println(n2+"Is larger than"+n1);
		}
		

	}

}

package com.edu;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		if(n==0)
		{
			System.out.println(n+"Is zero");
		}
		else if(n>0)
		{
			System.out.println(n+" Is a Positive");
		}
		else
		{
			System.out.println(n+" Is a Negative");
		}

	}

}

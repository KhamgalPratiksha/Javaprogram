package com.edu;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println(+num+"Is a Zero");
		}
		else if(num%2==0)
		{
			System.out.println(+num+"Is an Even");
		}
		else
		{
			System.out.println(+num+"Is an Odd");
		}

	}

}

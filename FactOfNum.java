package com.edu;

import java.util.Scanner;

public class FactOfNum {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		n=sc.nextInt();
		int fact=1;
		while(n>=1) {
			fact=fact*n;
			n=n-1;
		}
	System.out.println("Factorial="+fact);

	}

}

package com.edu;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		int m=num%2;
		switch(m) {
		case 0:System.out.println(num+" is an even");
			break;
		case 1:System.out.println(num+" is an odd");
		break;

		
		}

	}

}

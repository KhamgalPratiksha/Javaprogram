package com.edu;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int ch;
		float n1,n2,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("*************MENU**********");
		System.out.println("Enter your choice");
		System.out.println("1:ADDITION");
		System.out.println("2:SUBSTRACTION");
		System.out.println("3:MULTIPLICATION");
		System.out.println("4:DIVISION");
		ch=sc.nextInt();
		System.out.println("Enter 2 numbers");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		switch(ch) {
		case 1:ans=n1+n2;
		System.out.println("Sum of "+n1+" and "+n2+" is "+ans);
		break;
		case 2:ans=n1-n2;
		System.out.println("Difference of "+n1+" and "+n2+" is "+ans);
		break;
		case 3:ans=n1*n2;
		System.out.println("Multiplication of "+n1+" and "+n2+" is "+ans);
		break;
		case 4:
			if(n2!=0) {
				ans=n1/n2;
		System.out.println("Quotient of "+n1+" and "+n2+" is "+ans);
			}else {
		System.out.println("Divide by zero error");
			}
		
		break;
		default:System.out.println("Invalid input");
		}

	}

}

package com.edu;

import java.util.Scanner;

public class ElectricityBillOfConsumer {

	public static void main(String[] args) {
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		day=sc.nextInt();
		
		switch(day) {
		case 1:System.out.println("Monday : first day of the week");
		break;
		case 2:System.out.println("Tuesday : second day of the week");
		break;
		case 3:System.out.println("Wednesday : first day of the week");
		break;
		case 4:System.out.println("Thursday : first day of the week");
		break;
		case 5:System.out.println("Friday : first day of the week");
		break;
		case 6:System.out.println("Saturday : first day of the week");
		break;
		case 7:System.out.println("Sunday : first day of the week");
		break;
		default:System.out.println("Invalid input");
		}
	}
}

	





package com.area;
public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {//main is the starting point of the program
		int a,b;//declaration
		a=20;//assigning value
		b=25;//assigning value
		System.out.println("Before interchanging a="+a+" and b="+b);//display
		a=a+b;//a=20+25=45 //calculation
		b=a-b;//b=a-b;//45-25=20
		a=a-b;//a=a-b;//45-20=25
		
		
		System.out.println("After interchanging a="+a+" and b="+b);


	}

}

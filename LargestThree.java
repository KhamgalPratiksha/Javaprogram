package com.edu;

public class LargestThree {

	public static void main(String[] args) {
	int a,b,c,large; 
	a=11;
	b=9;
	c=7;
	
	large=(a>b && a>c)?a:(b>a && b>c)?b:c;
	System.out.println("The large of "+a+" , "+b+" and "+c+" is "+large);
			

	}

}

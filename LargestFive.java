package com.edu;

public class LargestFive {

	public static void main(String[] args) {
	int a,b,c,d,e,large;
	a=18;
	b=19;
	c=45;
	d=29;
	e=75;
	
	large=(a>b && a>c && a>d && a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>d && c>e)?c:(d>a && d>b && d>c && d>e)?d:e;
	System.out.println("The large of "+a+","+b+","+c+","+d+","+e+" is" +large);

	}

}

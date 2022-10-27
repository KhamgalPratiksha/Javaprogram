package com.edu;

public class MainApp {

	public static void main(String[] args) {
	//declaration of an array
	//syntax	
	//datatype var_name[]=new datatype[size];
	int ar[]=new int[6];
	//assigning values to an array
	ar[0]=9;
	ar[1]=8;
	ar[2]=7;
	ar[3]=5;
	ar[4]=4;
	ar[5]=3;
	
	System.out.println("Array Elements are");
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
	System.out.println(ar[4]);
	System.out.println(ar[5]);
	
	int s=ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5];
	System.out.println("Sum="+s);
	
			
	

	}

}

package com.edu;

public class ArrayClone {

	public static void main(String[] args) {
		int ar[]= {5,7,9,11};
		int ar1[]=ar.clone();
		
		System.out.println("Elements of copied array");
		System.out.println(ar1[0]+" "+ar1[1]+" "+ar1[2]+" "+ar1[3]);

	}

}

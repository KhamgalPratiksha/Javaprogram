package com.edu;

import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		int ar[]=new int[5];//store 5 elements of type int
		//int i;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		//input
		System.out.println("Array size="+ar.length);//5
		for(int i=0;i<ar.length;i++) {//0to4,ar.length=5
			ar[i]=ob.nextInt();//ar[0]=9 ar[1]=8 ar[2]=7 ar[3]=9 ar[4]=1
			//i=ob.next();
		}//display or output
		System.out.println("Array elements are");
		int s=0;
		for(int i=0;i<ar.length;i++) {
			s=s+ar[i];
			System.out.println(ar[i]);
		}
		System.out.println("sum="+s);
		//find the avg
		float avg=(float)s/ar.length;
		
		System.out.println("Average="+avg);

	}

}

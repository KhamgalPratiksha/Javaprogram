package com.pratu;

class Addition
{
	void add(int i,int j)
	{
		int sum=0;
		sum=i+j;
		System.out.println("sum of two int values"+i+" and"+j+" is"+sum);
	} 
	void add(float i,float j)
	{
		float sum;
		sum=i+j;
		System.out.println("sum of two float values"+i+" and"+j+" is"+sum);
		
	}
	void add(double i,double j)
	{
		double sum=0;
		sum=i+j;
		System.out.println("sum of two double values"+i+" and"+j+" is"+sum);
	}
	void add(short i,short j)
	{
		short sum=0;
		sum=(short)(i+j);
		System.out.println("sum of two short values"+i+" and"+j+" is"+sum);
	}
	void add(byte i,byte j)
	{
		byte sum=0;
		sum=(byte)(i+j);
		System.out.println("sum of two byte values"+i+" and"+j+" is"+sum);
	}
	void add(long i,long j)
	{
	 long sum;
		sum=(long)(i+j);
		System.out.println("sum of two long values"+i+" and"+j+" is"+sum);
	}
}


public class OverloadAddition {

	public static void main(String[] args) {
		Addition sc=new Addition();
		sc.add(9, 8);
		sc.add(45.5f, 45.5f);
		sc.add(50.5,50.5 );
		sc.add((short)9,(short)5);
		sc.add((byte)9,(byte)6);
		sc.add((long)900,(long)500);
	}
}
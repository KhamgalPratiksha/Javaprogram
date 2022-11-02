package com.pratu;

class Area{
	void area(int side)//Square
	{
		int area;
		area=side*side;
		System.out.println("Area of square"+side+" is"+area);
	}

	void area(int len,int bre)//Rectangle
	{
		int area;
		area=len*bre;
		System.out.println("Area of square"+len+" and "+bre+" is"+area);
	}

	void area(double radius)//circle
	{
		double area;
		area=3.14*radius*radius;
		System.out.println("Area of circle"+radius+" is"+area);
	}

	void area(float base,float hei)//Triangle
	{
		float area;
		area=(base*hei)/2;
		System.out.println("Area of triangle"+base+"and"+hei+" is"+area);
	}
}
public class OverloadArea {

	public static void main(String[] args) {
		Area sc=new Area();
		sc.area(9);
		sc.area(9,8);
		sc.area(9.9);
		sc.area(9.8f,8.9f);

	}

}

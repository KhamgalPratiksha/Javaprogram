package com.edu;

public class LargestFour {

	public static void main(String[] args) {
	int w,x,y,z,large;
	 w=40;
	 x=35;
	 y=20;
	 z=15;
			 

	
	large=(w>x && w>y && w>z)?w:(x>w && x>y && x>z)?x:(y>x && y>w && y>z)?y:z;
	
	System.out.println("Largest of "+w+" and "+x+" and "+y+" and "+z+" is" +large);

	}

}

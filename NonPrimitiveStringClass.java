package com.edu;

public class NonPrimitiveStringClass {

	public static void main(String[] args) {
		String name1="Pratiksha";
		String name2="Khamgal";
		
		//No of characters
		int l=name1.length();
		System.out.println("No of character="+l);
		
		System.out.println("1st character="+name1.charAt(0));
		System.out.println("last chararcter="+name2.charAt(6));
		String fname=name1+" "+name2;
		System.out.println("Full Name="+fname);
		
		String fn=name1.concat(name2);
		System.out.println("Full Name using concat function="+fn);
		
		System.out.println("lowercase="+name1.toLowerCase());
		System.out.println("lowercase="+name1.toUpperCase());
		
		//substring
		//name1=pratiksha
		//012345678
		System.out.println("Substring(3,6)"+name1.substring(3,7));
		System.out.println("Substring(3,6)"+name1.substring(3));

	}

}

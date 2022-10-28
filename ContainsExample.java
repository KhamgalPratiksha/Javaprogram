package com.edu;

public class ContainsExample {

	public static void main(String[] args) {
		String s="Hello Hi how are you";
		String st="hi";
		System.out.println("Hi is there or not"+s.contains(st));
		System.out.println("Position of e(left to right)="+s.indexOf('e'));
		System.out.println("lastIndexOf e(right to left)="+s.lastIndexOf('e'));
		
		System.out.println("Replace e with a"+s.replace('e','a'));
		System.out.println("Replace you with we "+s.replace("you", "we"));
		
		//reverse, append
		StringBuffer sb=new StringBuffer(s);
		StringBuilder sb1=new StringBuilder(s);
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.append("edubridge"));

	}

}

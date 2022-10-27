package com.edu;

import java.util.Scanner;
class Student{
int sid;
String sname;
float sfees;

void acceptData() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter sid");
sid=sc.nextInt();
System.out.println("Enter name");
sname=sc.next();
System.out.println("Enter sfees");
sfees=sc.nextFloat();
}

void display() {
System.out.println("Student id="+sid);
System.out.println("Student name="+sname);
System.out.println("Student fees="+sfees);
	}
}
public class MainStudent{
public static void main(String[] args) {
	Student sob1=new Student();
	Student sob2=new Student();
	sob1.acceptData();
	sob2.acceptData();
	sob1.display();
	sob2.display();
	
}
}

//Using class and object

package com.pratu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
	private String name;
	private int age;
	private float sal;
	public void inputData() throws IOException {
		/*InputStreamReader is=new InputStreamReader(System.in);
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		name=br.readLine();  //String
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		sal=Float.parseFloat(br.readLine());
		}
	
	public void displayData() {
		System.out.println("Employee Details");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);		
	}
}
public class CheckedExceptionMain1{
		
	public static void main(String[] args) throws IOException {
		Employee eob=new Employee();
		
		eob.inputData();
		eob.displayData();
		

	}

}

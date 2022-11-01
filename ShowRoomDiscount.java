package com.edu;

import java.util.Scanner;

class ShowRoom{
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	ShowRoom(){
		name="";
		mobno=0;
		cost=0;
		dis=0;
		amount=0;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("EnterName:");
		name=sc.nextLine();
		System.out.println("Enter Mobile number:");
		mobno=sc.nextLong();
		System.out.println("Enter Cost:");
		cost=sc.nextDouble();
	}
	void calculate() {
		if(cost<=10000) {
			dis=cost*5/100;
			amount=cost-dis;
		}
		else if(cost>10000 && cost<=20000) {
			dis=cost*10/100;
			amount=cost-dis;
		}
		else if(cost>20000 && cost<=35000) {
			dis=cost*15/100;
			amount=cost-dis;
		}
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Mobile no:"+mobno);
		System.out.println("Amount:"+amount);
	}
}
public class ShowRoomDiscount {

	public static void main(String[] args) {
		ShowRoom ob=new ShowRoom();
		ob.input();
		ob.calculate();
		ob.display();

	}

}

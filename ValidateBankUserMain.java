package com.pratu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ValidateUser{
	private String un,pass;
	
	public void inputUser() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Name");
		un=br.readLine();
		System.out.println("Enter password");
		pass=br.readLine();
		
	}
	public int userCheck() {
		if(un.equalsIgnoreCase("pratu")&&(pass.equals("pratu123"))){
			System.out.println("Valid User");
			return 1;
		}
		else  {
			System.out.println("Invalid User");
			return 0;
		}
	}


public class ValidateBankUserMain {

	public static void main(String[] args) throws IOException{
		ValidateUser bob=new ValidateUser();
		int flag=-1;
		System.out.println("User can try Maimum 3 times,Then your acccount will be closed for 24hrs");
		int count=3;
		while(count>0) {
			bob.inputUser();
			flag=bob.userCheck();
			if(flag==1)
			{
				break;
			}
			else
			{
				count=count-1;
				System.out.println("You have"+count+"limits");
			}
		}
		if(flag==0) {
			System.out.println("Your account is locked try after 24 hrs");
		}

	}
}
}




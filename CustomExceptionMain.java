package com.pratu;

class PersonAge extends Exception{

	public PersonAge(String s) {
		super(s);
	}
}
class vote{
	void checkAge(int a) {
		try {
			if(a<18)throw new PersonAge("Age less than not eligible for vote");
		}catch(PersonAge e) {
			e.printStackTrace();
		}
	}
}
public class CustomExceptionMain {

	public static void main(String[] args) {
		vote vob=new vote();
		vob.checkAge(12);
	

	}

}

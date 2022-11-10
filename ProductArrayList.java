package eduCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
	int pid;
	String pname;
	float pprice;
	
  void inputData() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter pid");
	pid=sc.nextInt();
	System.out.println("enter pname");
	pname=sc.next();
	System.out.println("enter pprice");	
	pprice=sc.nextFloat();
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}

}

public class ProductArrayList {

	public static void main(String[] args) {
		
		ArrayList<Product> plist= new ArrayList<Product>();
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		
		p1.inputData();
		p2.inputData();
		p3.inputData();
		p4.inputData();
			
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
			
		System.out.println(plist);
		System.out.println("*****************************");
		
		System.out.println("Using iterator");
		Iterator<Product> pt=plist.iterator();
		System.out.println("PID\tPNAME\tPPRICE");
		while(pt.hasNext()) {
			Product pob=pt.next();
			System.out.println(pob.pid+"\t"+pob.pname+"\t"+pob.pprice);
			
		}
	
		
		}
}
	

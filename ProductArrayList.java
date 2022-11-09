package eduCollection;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	int pid;
	String pname;
	float pprice;
	public Product(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}

public class ProductArrayList {

	public static void main(String[] args) {
		ArrayList<Product> plist=new ArrayList<Product>();
		Product p1=new Product(1,"amul",160.5f);
		Product p2=new Product(2,"kissan",250.8f);
		Product p3=new Product(3,"mdh",300.65f);
		Product p4=new Product(4,"chitale",500.4f);
		
		
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		
		
				
		System.out.println(plist);
		System.out.println("****************************");
			
		Iterator<Product> pt=plist.iterator();
		System.out.println("PID\tPNAME\tPPRICE");
		while(pt.hasNext()) {
			Product pob=pt.next();
			System.out.println(pob.pid+"\t"+pob.pname+"\t"+pob.pprice);
		}
		}
	}

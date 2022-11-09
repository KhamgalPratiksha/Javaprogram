package eduCollection;

import java.util.Iterator;

import java.util.LinkedList;

class Employee{
	int eid;
	String ename;
	float esal;
	String edep;
	public Employee(int eid, String ename, float esal, String edep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edep = edep;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edep=" + edep + "]";
	}


	}
	


public class EmployeeMainApp {

	public static void main(String[] args) {

		LinkedList<Employee> elist= new LinkedList<Employee>();
		Employee e1=new Employee(1,"pratu",5000.5f,"CSE");
		Employee e2=new Employee(2,"pooja",5400.6f,"ISE");
		Employee e3=new Employee(3,"akansha",5456.5f,"SE");
		Employee e4=new Employee(4,"pranav",5098.5f,"EE");
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		
		System.out.println(elist);
		System.out.println("************************");
		
		
		
		Iterator<Employee> et=elist.iterator();
		System.out.println("EID\tENAME\tESAL\tEDEP");
		while(et.hasNext())
		{
		Employee eob=et.next();
		System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esal+"\t"+eob.edep);
	}

}
}

package prac;

public class Employee {
 private int eid;
 private String ename;
 private Eaddress eadd;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}


public Eaddress getEadd() {
	return eadd;
}
public void setEadd(Eaddress eadd) {
	this.eadd = eadd;
}
public static void main(String[] args) {
	Eaddress ed=new Eaddress();
	ed.setCity("pune");
	ed.setArea("karve nagar");
	
	Employee e=new Employee();
	e.setEid(123456);
	e.setEname("vishal");
	e.setEadd(ed);
	System.out.println(e.getEid());
	System.out.println(e.getEname());
	System.out.println(e.getEadd().getCity());
	System.out.println(e.getEadd().getArea());
	
	
	
}
 
}

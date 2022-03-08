package prac;

public class Test1 {
	public void m1(Eaddress ed)
	{
		System.out.println(ed.getCity());
		System.out.println(ed.getArea());
	}
	public static void main(String[] args) {
		Eaddress e=new Eaddress();
		e.setCity("pune");
		e.setArea("karve nagar");
		
		Test1 t=new Test1();
		t.m1(e);
	}

}

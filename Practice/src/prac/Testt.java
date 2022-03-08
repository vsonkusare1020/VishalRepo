package prac;

public class Testt {
	public Eaddress m1()

	{
		Eaddress ed= new Eaddress();
		ed.setArea("pune");
		ed.setCity("pune");
		return ed;
	}
 public static void main(String[] args) {
	Testt t=new Testt();
	Eaddress ed1=t.m1();
	System.out.println(ed1.getArea());
	System.out.println(ed1.getCity());
}
}

package prac;

public class Test {
	public static void main(String[] args) {
		Setget s=new Setget();
		s.setA(10);
		s.setD(10.5);
		s.setF(16.1f);
		s.setS("vishal");
		System.out.println(s.getA());
		System.out.println((s.getD())+"         "+(s.getF())+s.getS());
		
	}

}

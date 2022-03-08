package prac;

public class BB extends Aaaaa {
	public void m1() {
		System.out.println("m1---bbb");
	}

	public static void main(String[] args) {
		Aaaaa a = new BB();
		a.m2();
	}

}

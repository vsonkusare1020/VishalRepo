package prac;

public class T {
	public void m1(Object a) {
		System.out.println("obj");
		System.out.println("obj");
	}
	public void m1(String s) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		T t=new T();
		t.m1((Object)null);
	}
}

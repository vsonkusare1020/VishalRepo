package logicalpro;

public class SwapNum {
	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 40;
		System.out.println("pre swap");
		System.out.println(n1);
		System.out.println(n2);
		n1 = n1 - n2; // -10
		n2 = n1 + n2; // 30
		n1 = n2 - n1;
		System.out.println("postswap");
		System.out.println(n1 + "\n" + n2);
	}

}

package logicalpro;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit num");
		int num=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}


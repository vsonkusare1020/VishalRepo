package logicalpro;

import java.util.Scanner;

// 5^2 = 25, 6^2 = 36, 76^2=5776(76==76  5776 last 2 digit i.e.76 )
public class Automorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		int n=sc.nextInt();
		int sq=n*n;
		int n1=n;
		int temp=1;
		while(n1>0) {
			n1=n1/10;
			temp=temp*10;
			System.out.println(temp);
		}
		System.out.println(sq);
		sq=sq%temp;
		if(sq==n) {
			System.out.println(n+" is Atomic number");
		}
		else {
			System.out.println(n+"is not Atm number");
		}
		
	}

}

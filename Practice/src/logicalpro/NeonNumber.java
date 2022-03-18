package logicalpro;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		System.out.println("if num=9 > 9 square=81 => 8+1=9");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sq=n*n;
		int count=0;
		while(sq>0) {
			count=count+(sq%10);
			//System.out.println(count);
			sq=sq/10;
		}
		if(count==n) {
			System.out.println(n+" is neon number");
		}else {
			System.out.println("not");
		}
		
	}

}

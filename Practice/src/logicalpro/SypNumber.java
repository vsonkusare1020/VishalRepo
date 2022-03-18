package logicalpro;

import java.util.Scanner;

//1124 => 1+1+2+4 = 1 x 1 x 2 x 4 = 8
public class SypNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		int mult=1;
		while(num>0) {
			sum=sum+(num%10);
			mult=mult*(num%10);
			num=num/10;
		}
		if(sum==mult) {
			System.out.println(n+" is Spy number");
		}else {
			System.out.println(n+" is not spy number");
		}
	}
	

}

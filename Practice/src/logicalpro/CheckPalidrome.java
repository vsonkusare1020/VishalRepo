package logicalpro;

import java.util.Scanner;
//121 reverse 121 ex. 121,343,1441,7767677
public class CheckPalidrome {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter Any Number:");
		int n1=sc.nextInt();
		int n=n1;
		int nrev=0;
		while(n>0) {
			nrev=nrev*10+(n%10);
			System.out.println(nrev);
			n=n/10;
		}
		if (nrev==n1) {
			System.out.println(n1+" is palidrome number");
			
		} else {
			System.out.println(n1+" is not palidrome number");
		}
	}

}

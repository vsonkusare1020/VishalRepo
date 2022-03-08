package logicalpro;

import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("abc");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int larg1;
		int small;
		int mid;
		
		if(a>b && a>c) {
		
			larg1=a;
		}
		else if(b>c) {
			larg1=b;
		}else {
			larg1=c;
		}
		
		if(a<b && a<c) {
			
			small=a;
		}
		else if(b<c) {
			small=b;
		}else {
			small=c;
		}
		
		if(larg1!=a) {}
		
		
		
	}

}

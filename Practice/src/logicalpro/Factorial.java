package logicalpro;

import java.util.Scanner;

//num=4  factorial=4*3*2*1=24

public class Factorial {
	public static void main(String args[])
	{
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++){
			fact=fact*i;
		}
		System.out.print(num+" fact is "+fact);
	}

}

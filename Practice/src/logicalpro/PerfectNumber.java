package logicalpro;

import java.util.Scanner;

//n=6 then 6 complately divided by 3,2,1 sum of 3+2+1=6 then 6 is perfect number
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(n + " is perfect Number = "+(sum==n));
		
		if (sum == n) {
			System.out.println(n + " is perfect Number");
		} else {
			System.out.println(n + " is not perfect Number");
		}
	}

}

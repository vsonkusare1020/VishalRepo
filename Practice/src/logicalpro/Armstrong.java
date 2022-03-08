package logicalpro;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int num1 = sc.nextInt();
		int num = num1;
		int rem;
		int check = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			check = check + (rem * rem * rem);
		}
		// System.out.println(check);
		if (check == num1) {
			System.out.println(num1 + " is Armstrong no");
		} else {
			System.out.println(+num1 + " is not Armstrong no");
		}
	}

}

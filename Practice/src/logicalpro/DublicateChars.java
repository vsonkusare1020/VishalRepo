package logicalpro;

import java.util.Iterator;
import java.util.Scanner;

public class DublicateChars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Word");
		String s = sc.next();
		char[] c = s.toCharArray();
		System.out.println("Dublicate char are=");
		for (int i = 0; i < c.length; i++) {
			for (int j =i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					System.out.print(c[j]+" ");
					
					break;
				}
			}
		}
	}
}

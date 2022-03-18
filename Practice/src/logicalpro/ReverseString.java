package logicalpro;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any word:");
		String name=sc.next();
		char chars[]=name.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		
		
		//rev string stored in another String variable
		
		String rev = "";
		for(int i=chars.length-1;i>=0;i--) {
			
			rev=rev+chars[i];
		}
		System.out.println("\n"+rev);
		
		
		
		//using charAt() 
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}
}

package logicalpro;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		String name="Vishal";
		char chars[]=name.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}
}

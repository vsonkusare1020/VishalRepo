package StringProblems;

import java.util.Scanner;

//Print first letter of every word in the string 
public class PrintFirst {

	public static String FirstLtrWord(String line) {
		String result = "";
		boolean v = true;
		for (int i = 0; i < line.length(); i++) {
			// System.out.println(i);
			if (line.charAt(i) == ' ') {
				v = true;
			}

			else if (line.length() != ' ' && v == true) {
				result = result + line.charAt(i);
				v = false;

			}
		}

		return result;
	}

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		String str = "Vishal P Sonkusare";
		// PrintFirst p=new PrintFirst();
		// System.out.println(p.FirstLtrWord(str));
		System.out.println(FirstLtrWord(str));
	}

}

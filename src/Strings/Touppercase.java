package Strings;

import java.util.Scanner;

public class Touppercase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(Touppercase(s));

	}

	private static String Touppercase(String s) {
	    String t= "";
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	t=t+(char)(ch-32);
	    }return t;
	}

}

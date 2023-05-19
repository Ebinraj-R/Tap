package Strings;

import java.util.Scanner;

public class Tolowercase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(toLowercase(s));

	}

	private static String toLowercase(String s) {
	    String t= "";
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	t=t+(char)(ch+32);
	    }return t;
	}


	}



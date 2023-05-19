package Strings;

import java.util.Scanner;

public class RemoveCases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(lowercases(s));
		System.out.println(upperCases(s));
		System.out.println(AlphaNumeric(s));
		
		}


	private static String AlphaNumeric(String s) {
		
			String t ="";
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(!(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' ||ch>='0' && ch<='9')) {
					t=t+ch;
			
				}

	}return t;
	}


	private static String upperCases(String s) {
		String t ="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' ) {
				t=t+ch;
		
			}

}return t;
	}


	private static String lowercases(String s) {
		String t ="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' ) {
				t=t+ch;
		
			}

}return t;

}
}
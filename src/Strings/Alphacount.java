package Strings;

import java.util.Scanner;

public class Alphacount {
	private static String AlphaCount(String s) {
		String t ="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z' || ch>='0'&&ch<='9') {
				t=t+ch;
			}
		}return t;
		}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(AlphaCount(s));

	}

	
}

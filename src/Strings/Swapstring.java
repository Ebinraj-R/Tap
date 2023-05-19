package Strings;

import java.util.Scanner;

public class Swapstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(swapString(s));

	}

	private static String swapString(String s) {
	    String t= "";
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	if(ch>='A'&&ch<='Z') {
	    	t=t+(char)(ch+32);
	    	}
	    	if(ch>='a'&&ch<='z') {
		    	t=t+(char)(ch-32);
		    }
	    }return t;
	}

}

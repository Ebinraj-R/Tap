package Strings;

import java.util.Scanner;

public class Lowercount {

		private static int lowerCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				count++;
			}
		}return count;
	}
		
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(lowerCount(s));
	
	}
		
	}



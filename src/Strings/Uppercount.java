package Strings;

import java.util.Scanner;

public class Uppercount {
	private static int upperCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}return count;
	}
		
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(upperCount(s));
	
	}

}

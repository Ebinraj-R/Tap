package Strings;

import java.util.Scanner;

public class Palindrome {

	
		 static boolean palindrome (String s) {
			 String t="";
				for(int i=s.length()-1;i>=0;i--) {
					t=t+s.charAt(i);
					}
				if(s.equals(t)) {
					return true;
				}
				else {
					return false;
				}
				}
					
				
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter the String");
			String s = scan.next();
			System.out.println(palindrome(s));


	}

}

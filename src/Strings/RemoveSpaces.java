package Strings;

import java.util.Scanner;
  
public class RemoveSpaces {
	
	 static String removeSpaces(String s) {
		 String t="";
		int si=0,ei=0;
		for (int i = 0;i<s.length(); i++) {
			char ch= s.charAt(i);
			if(ch != ' ') {
				si=i;
				break;
			}
		}
		for (int i = s.length()-1;i>=0; i--) {
			char ch= s.charAt(i);
			if(ch != ' ') {
				ei=i;
				break;
			}
		}
		for (int i = si; i<=ei; i++) {
			char ch=s.charAt(i);
			t=t+ch;
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the string");
		String s = scan.nextLine();
		System.out.println(removeSpaces(s));

	}


}

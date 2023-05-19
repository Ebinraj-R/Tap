package Strings;

import java.util.Scanner;

public class NextLine {
    static void Nextline(String s) {
    	   
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		Nextline(s);
		
		
	}

	

}

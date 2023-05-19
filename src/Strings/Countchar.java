package Strings;

import java.util.Scanner;

public class Countchar {

	static int  countChar(String s) {
 	    int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
		}return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println(countChar(s));
		
		
	}
}

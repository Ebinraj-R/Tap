package Strings;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(consonantsCount(s));


	}

	private static int consonantsCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U') {
				count++;
			}
		}return count;
	}

}

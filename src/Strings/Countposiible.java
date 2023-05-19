package Strings;

import java.util.Scanner;

public class Countposiible {
	private static void countpossible(String s) {
		int vc=0;
		int cc=0;
		int sc=0;
		int nc=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U') {
				vc++;
			}
			else if(!(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U') || ch>='a' ||ch<='z' ||ch>='A' ||ch<='Z') {
				cc++;
			}
			else if(ch>='0'&&ch<='9') {
				nc++;
			}
			else {
				sc++;
			}
		}System.out.println("vowels count"+vc);
		System.out.println("consanants count"+cc);
		System.out.println("numeric count"+nc);
		System.out.println("special count"+sc);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		countpossible(s);

	}



}

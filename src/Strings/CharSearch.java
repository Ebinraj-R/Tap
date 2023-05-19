package Strings;
import java.util.Scanner;
public class CharSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		System.out.println("Enter the Char");
		char cha = scan.next().charAt(0);
		System.out.println((Stringsearch(s,cha)));
	}

	 static int Stringsearch(String s, char cha) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==cha) {
				return i;                  
			}
		}
		return -1;
		
	}

}

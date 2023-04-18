package Strings;

import java.util.Scanner;

public class Space {
       static int Space(String s) {
    	   int count=0;
    	   for(int i = 0;i<s.length();i++) {
    	   if(s.charAt(i)==' ') {
    		   count++;
    	   }
    	   }return count;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println(Space(s));
	}

	

}

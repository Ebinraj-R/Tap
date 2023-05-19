package Strings;

import java.util.Scanner;

public class CountSpace {

	 
		 static int Space(String s) {
	    	   int count=0;
	    	   for(int i = 0;i<s.length()-1;i++) {
	    	   if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
	    		   count++;
	    	   }
	    	   }return count+1;
		}


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the String");
			String s = scan.nextLine();
			System.out.println(Space(s));
		}
	 
}



package Strings;

import java.util.Scanner;

public class ArrayString {
	     static int countWords(String s) {
	    	 int count=0;
	    	 for(int i=0;i<s.length();i++)
	    		 {
	    		   if(s.charAt(i) ==' '&& s.charAt(i+1)!=' ') {
	    			   count++;
	    		   }
	    		 }return count+1;
		
		
	    }
	
        static void reverseWord(String s) {
        int  n = countWords(s); 
		String [] arr = new String [n];
		
	}



	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		reverseWord(s);
		

	}


}

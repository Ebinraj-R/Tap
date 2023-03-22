package com.Tap.Paterns;
import java.util.Scanner;
public class Sumofn { 
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum(n);
}
     static void sum(int n)
     {
	 int count=0;
	 for(int i=1;i<=n;i++) {
		count = count+i;
	 } System.out.println(count);
	}

}

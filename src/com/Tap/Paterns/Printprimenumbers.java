package com.Tap.Paterns;
import java.util.Scanner;
public class Printprimenumbers {
	static Boolean primenumbers(int n) {
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	static void printprimenumbers(int n)
	{
		for(int i=2;i<=n;i++) {
		if(primenumbers(i) ==true) 
		{
	     System.out.println(i);}
     }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    printprimenumbers(n);

	}
	}
	

	
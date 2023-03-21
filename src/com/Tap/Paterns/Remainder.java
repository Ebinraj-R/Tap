package com.Tap.Paterns;
import java.util.Scanner;
public class Remainder 
	{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n>m) {
			int rem = n%m;
			System.out.println(rem);
		}
		else {
			System.out.println(-1);
		}
	}
	
		
	

	}

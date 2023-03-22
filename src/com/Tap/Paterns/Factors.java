package com.Tap.Paterns;
import java.util.Scanner;
public class Factors {
	
	 static void  factors(int a)
	 {
		for(int i=1;i<=a;i++)
		{
			if (a%i==0)
			{
				System.out.println(i);
			}
		}
	 }	
	public static void main(String[]args)
	{	Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		factors(n);
	}
	
	}


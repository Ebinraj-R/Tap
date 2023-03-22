package com.Tap.Paterns;
import java.util.Scanner;
public class Countfactors {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	factors(n);
	}
	static void factors(int a)
     {
     int c = 0; 
		for(int i= 1;i<=a;i++)
		{
			if(a%i==0) 
			{
				c++;
			}
	}System.out.println(c);
	}
}

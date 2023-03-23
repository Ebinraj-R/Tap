package com.Tap.Paterns;
import java.util.Scanner;
public class Commonmultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		commonmultiple(n,a,b);
	
	}

	 static void commonmultiple(int n, int a, int b) {
		int count = 1;
		for(int i = 1;count<=n;i++)
		{
			if(i%a==0 && i%b==0)
			{
			System.out.println(i);	
			count++;
			}
			}
	}

}

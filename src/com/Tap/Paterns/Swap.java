package com.Tap.Paterns;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swaping" + a + " " + b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;   
		System.out.println("After swaping" + a + " "+ b);
		
		
	}

}

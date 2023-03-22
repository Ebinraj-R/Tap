package com.Tap.Paterns;
import java.util.Scanner;
public class Primenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primenumbers(n));

	}

	static Boolean primenumbers(int n) {
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	
}

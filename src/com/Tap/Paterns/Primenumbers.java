package com.Tap.Paterns;
import java.util.Scanner;
public class Primenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(primenumbers(p));

	}

	static Boolean primenumbers(int n) {
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}

}

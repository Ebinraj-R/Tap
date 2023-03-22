package com.Tap.Paterns;

import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n= sc.nextInt();
		int o= sc.nextInt();
		if (l<m && l<n && l<o) {
			System.out.println("the smallest number is " + l);}
			else if(m<n && m<o){
				System.out.println("the smallest number is " + m);
			}
			else if(n<o) {
				System.out.println("the smallest number is "+ n);
		}
			else {
				System.out.println("the smallest number is "+o);
			}

	}

}

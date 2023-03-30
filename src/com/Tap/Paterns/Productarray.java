package com.Tap.Paterns;
import java.util.Scanner;
public class Productarray {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("take number");
             int n = sc.nextInt();
            int [] a = new int [n];
            System.out.println("take numbers of array");
            for(int i=0;i<a.length;i++) {
            	a[i]=sc.nextInt();
            }
            product(a);
	}

	 static void product(int[] a) {
		 int multiply = 1;
		for(int i=0;i<a.length;i++) {
			multiply = multiply * a[i];
				
	}
		System.out.println(multiply);
		}

}

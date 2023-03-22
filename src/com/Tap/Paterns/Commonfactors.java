package com.Tap.Paterns;
import java.util.Scanner;
public class Commonfactors {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		commonfactors(n,m);
     }
     static void commonfactors(int n, int m)
     {
     int min;
	  if(n>m) {
		  min=m;
	  }
	  else {
		  min=n;
	  }
	  for(int i=1;i<=min;i++) {
		  if(n%i==0 && m%i==0) {
			  System.out.println(i);
		  }
	  }
	}

}

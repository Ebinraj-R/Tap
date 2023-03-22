package com.Tap.Paterns;
import java.util.Scanner;
public class HCF{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	     hcf(n,m);
     }
     static void hcf(int n, int m)
     {
     int min;
	  if(n>m) {
		  min=m;
	  }
	  else {
		  min=n;
	  }
	  for(int i=min;i>0;i--) {
		  if(n%i==0&&m%i==0) {
			  System.out.println(i);
			  break;
		  }
	  }
	}

}

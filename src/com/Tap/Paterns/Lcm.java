package com.Tap.Paterns;
import java.util.Scanner;
public class Lcm{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	     int res = hcf(n,m);
	     lcm(n,m);
     }
    static void lcm(int n, int m)
    {
		int r;
		r=(m*n)/hcf(n,m);
		System.out.println(r);
		
	}
	static int hcf(int n, int m)
     {
     int min;
	  if(n>m) {
		  min=m;
	  }
	  else {
		  min=n;
	  }
	  int c=0;
	  for(int i=min;i>0;i--) {
		  if(n%i==0&&m%i==0) {
			 c =i;
			  break;
		  }
	  }return c;
	  
	}}

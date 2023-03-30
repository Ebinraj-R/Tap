package com.Tap.Paterns;
import java.util.Scanner;
public class AddArray
{
public static void main(String[] args) {
        	  Scanner sc = new Scanner(System.in);
        	  int n = sc.nextInt();
        	  int [] a = new int[n];
        	  for(int i = 0;i<a.length;i++)
        	  {
        		  a[i]=sc.nextInt();
        	  }
        	 sum(a);
	 
          }
         static void sum(int a[]) {
			int add=0;
			for(int i=0;i< a.length;i++) {
				 add = add+a[i];
			}System.out.println(add);

		}
}

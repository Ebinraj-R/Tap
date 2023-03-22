package com.Tap.Paterns;
import java.util.Scanner;
public class LCF 
     {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		lcm(a,b);
}
     static void lcm(int a ,int b) 
     {  int min;
		if(a>b) {
			min=b;
		}
		else {
			min=a;
		}
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
			 System.out.println(i);
			 break;
			}
		}
}

}

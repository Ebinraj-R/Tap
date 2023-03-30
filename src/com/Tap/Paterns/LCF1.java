package com.Tap.Paterns;
import java.util.Scanner;
public class LCF1
     {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		lcf(a,b);
}
     static void lcf(int a ,int b) 
     {  int min;
		if(a>b) {
			min=b;
		}
		else {
			min=a;
		}
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0)
			{
			 if(i>2) 
			 {
				 System.out.println(i);
				 break;
			 }
			}
		}
}

}
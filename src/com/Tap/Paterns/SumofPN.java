package com.Tap.Paterns;
import java.util.Scanner;
class SumofPN
{
	public static void main (String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	int t= scan.nextInt();
	int counts=0;
	int countr=0;
	int [] a = new int[7];
	for (int j=0;j<t;j++){
	for (int i=0;i<a.length;i++){
	    a[i]=scan.nextInt();
	}
	    for(int i=0;i<a.length;i++){
	      
	        if(a[i]==1){
	            counts++;
	        }else{
	            countr++;
	        }
	    }if(counts>countr){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
	    
	    }
	    
	
	}
}


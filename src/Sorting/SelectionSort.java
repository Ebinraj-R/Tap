package Sorting;

import java.util.Scanner;

public class SelectionSort { 
	 static void selectionSort(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			int min_i=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min_i]) {
					min_i=j;
					
				}
				int temp=ar[i];
				ar[i]= ar[min_i];
				ar[min_i]=temp;
				
			}
		}
			
		
	}
	

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = scan.nextInt();
		
		int [] ar = new int[n];
        System.out.println("enter the array values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
        selectionSort(ar);
        for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
   }


}

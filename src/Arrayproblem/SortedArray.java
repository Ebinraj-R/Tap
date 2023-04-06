package Arrayproblem;

import java.util.Scanner;

public class SortedArray {
	
	 static int[] Sortedarray(int[] a1, int[] a2) {
    	 int [] res = new int [a1.length+a2.length];
    	 int i=0,j=0,k=0;
    	 while(i<a1.length && j<a2.length) {
    	 if(a1[i]<a2[j]) {
    		 res[k]=a1[i];
    		 k++;
    		 i++;
    	 }
    	 else {
    		 res[k]=a2[j];
    		 k++;
    		 j++;
    	 }
	 }
    	 while(i<a1.length){
    		 res[k]=a1[i];
    		 k++;
    		 i++;
    	 }
    	 while(j<a2.length) {
    		 res[k]=a2[j];
    		 k++;
    		 j++;
    	 } return res;
	 }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first array size");
		int m = scan.nextInt();
		int[] a1 = new int[m];
		for(int i=0;i<a1.length;i++) {
			a1[i]=scan.nextInt();
           }
		System.out.println("enter the second array size");
		int n = scan.nextInt();
		int[] a2 = new int[n];
		for(int i=0;i<a2.length;i++) {
			a2[i]=scan.nextInt();
		}
		int[]result=Sortedarray(a1,a2);
		for(int i=0;i<result.length;i++) {
   		 System.out.print(result[i]);
   	 }
	}
}

	

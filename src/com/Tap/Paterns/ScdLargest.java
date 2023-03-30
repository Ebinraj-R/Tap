package com.Tap.Paterns;
import java.util.Arrays;
import java.util.Scanner;
public class ScdLargest {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
     int[] a = new int [n];
    
     for(int i = 0;i<n;i++) {
    	 a[i]=scan.nextInt();
 }
     
     Arrays.sort(a);
     System.out.println(a[0]);
//     int temp;
//     for(int i=0;i<a.length;i++) {
//    	 for(int j=i+1;j<a.length;j++) {
//    		 if(a[i]>a[j]) {
//    			temp=a[i];
//    			a[i]=a[j];
//    			a[j]=temp;
//    		 }
//    	 }
//    	 
//     }
//     System.out.println(a[a.length]);
     //int fl = Integer.MIN_VALUE;
//      int sl = Integer.MIN_VALUE;
//     for(int i = 0;i<a.length;i++) {
//    	 if(a[i]>fl) {
//    		 sl=fl;
//    		 fl=a[i];
//    	 }else if(a[i]<sl && a[i]!=fl);
//    	 {
//    		 sl=a[i];
//    	 }
//     }System.out.println(sl);
//     
//}

}
}

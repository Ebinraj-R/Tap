package com.Tap.Paterns;
import java.util.Scanner;
public class SumofoddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar =new int[n];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			}
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]%2 != 0) {
				sum = sum+ar[i];
			}
		}System.out.println(sum);
		

}
}
package com.Tap.Paterns;
import java.util.Scanner;
public class Evenindex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar =new int[n];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			}
		for(int i=0;i<ar.length;i++) {
			if(i%2 ==0) {
				System.out.println(ar[i]);
			}
		}
		

}
}
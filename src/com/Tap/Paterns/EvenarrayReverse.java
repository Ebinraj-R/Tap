package com.Tap.Paterns;
import java.util.Scanner;
public class EvenarrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar =new int[n];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			}
		for(int i =ar.length-1;i>=0;i--) {
			if(ar[i]%2 ==0) {
				System.out.println(ar[i]);
			}
		}
		

}
}
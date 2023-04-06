package Arrayproblem;
import java.util.Scanner;
public class Possiblepairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
        	a[i]=scan.nextInt();
        }
        possiblepairs(a);
	}

	 static void possiblepairs(int[] a) {
		 for(int i=0;i<a.length-1;i++) {
			 for(int j=i+1;i<a.length;j++) {
				 System.out.println(a[i]+" "+a[j]);
			 }
		 }
	}

}

package Arrayproblem;
import java.util.Scanner;
public class AbsoluteSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int res=Absolutesum(a);
		System.out.println(res);
	}

	 static int Absolutesum(int[] a) {
		 int sum = 0;
		 
		 for(int i=0;i<a.length;i++) {
			  sum = sum+a[i];
		 }
	 return  Math.abs(sum);

	 }
}

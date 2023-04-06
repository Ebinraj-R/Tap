package Arrayproblem;
import java.util.Scanner;
public class PrintInbtwn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
		if(a[i]%2!=0 && a[i+1]%2!=0) {
			System.out.print(a[i]+"*");
		}
		else if(a[i]%2==0 && a[i+1]%2==0) {
			System.out.print(a[i]+"#");
		}
		else {
			System.out.print(a[i]+"$");
		}
		}System.out.println(a[a.length-1]);
	}

}

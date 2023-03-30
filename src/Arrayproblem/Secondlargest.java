package Arrayproblem;
import java.util.Scanner;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();}
			int fl=Integer.MIN_VALUE;
			int sl=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>fl) {
				sl=fl;
				fl=a[i];
			}
			else if(a[i]>sl && a[i]!=sl) {
				sl=a[i];
			
		}System.out.println(fl);
	}

	}
	}

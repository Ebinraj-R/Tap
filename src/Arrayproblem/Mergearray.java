package Arrayproblem;
import java.util.Scanner;
public class Mergearray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first array size");
		int m = scan.nextInt();
		int[] a1 = new int[m];
		for(int i=0;i<a1.length;i++) {
			a1[i]=scan.nextInt();
           }
		System.out.println("enter the first array size");
		int n = scan.nextInt();
		int[] a2 = new int[n];
		for(int i=0;i<a2.length;i++) {
			a2[i]=scan.nextInt();
		}
		System.out.println("enter the first array size");
		int p = scan.nextInt();
		int[] a3 = new int[p];
		for(int i=0;i<a3.length;i++) {
			a3[i]=scan.nextInt();
		}

		int [] res = new int [a1.length+a2.length+a3.length];
		int i=0,k=0;
		while(k<res.length) {
			if(i<a1.length) {
				res[k]=a1[i];
				k++;
			}
			if(i<a2.length) {
				res[k]=a2[i];
				k++;
			}
			if(i<a3.length) {
				res[k]=a3[i];
				k++;
			}
		i++;
		}		
		for(int j=0;j<res.length;j++) {
			System.out.print(res[j]);
		
	}

}
}
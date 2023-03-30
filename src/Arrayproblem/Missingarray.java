package Arrayproblem;
import java.util.Scanner;
public class Missingarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			 a [i] = scan.nextInt();
		}
		int sum=0;
        for(int i=0;i<a.length;i++) {
        	sum=sum+a[i];
        }
        int ar=n+1;
        int r= ar*(ar+1)/2;
        System.out.println(r-sum);
      
        
	}

}

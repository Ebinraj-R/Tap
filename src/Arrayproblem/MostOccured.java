package Arrayproblem;
import java.util.Scanner;
public class MostOccured {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		mostoccured(a);
	}

	 static void mostoccured(int[] a) {
		 int count=1;
		 int max=0;
		 int ele = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					ele=a[i];
					
				}count=1;
				
			}
		}
		if(count>max) {
			max=count;
			ele=a[a.length-1];
		}System.out.println(ele);
		
	}

}

package SubArrays;

import java.util.Scanner;

public class SumofSubArrays {
	static void sumofsubarrays(int[] arr, int size) {
		
		 for(int i=0; i <= arr.length-size; i++) {
			    int sum = 0;
				for(int j=i; j<i+size; j++) {
					sum = sum + arr[j];
				}
				System.out.println(sum);
				}
			}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int size = scanner.nextInt();
		sumofsubarrays(arr, size);
	

	 
	}

}

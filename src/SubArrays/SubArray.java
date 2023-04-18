package SubArrays;

import java.util.Scanner;

public class SubArray {
	
     static void generateSubarrays(int[] arr, int size) {
		for(int i=0; i <= arr.length-size; i++) {
			for(int j=i; j<i+size; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
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
		generateSubarrays(arr, size);
		
	}
}

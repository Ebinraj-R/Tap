package SubArrays;

import java.util.Scanner;

public class SubarrayEquals {
	static void subarraysequals(int[] arr, int size,int value) {
		
		 for(int i=0; i <= arr.length-size; i++) {
			    int sum = 0;
				for(int j=i; j<i+size; j++) {
					sum = sum + arr[j];
				}
				
		        if(sum == value) {
		        	for(int j=i; j<i+size; j++) {
						System.out.print(arr[j]+" ");
					}
		        }System.out.println( );
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
		int value =scanner.nextInt();
		subarraysequals(arr, size,value);
	

	 
	}
	
	
}

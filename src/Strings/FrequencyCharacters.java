package Strings;
import java.util.Scanner;
public class FrequencyCharacters {
	private static void frequencyCharacters(String s) {
		int Size = 26;
		int []freq = new int [Size];
		int n = s.length();
		for(int i=0;i<n;i++) {
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++) {
			if(freq[s.charAt(i)-'a']!=0) {
				System.out.print(s.charAt(i)+"-");
				System.out.println(freq[s.charAt(i)-'a']);
				freq[s.charAt(i)-'a']=0;
				
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		frequencyCharacters(s);
	}


}

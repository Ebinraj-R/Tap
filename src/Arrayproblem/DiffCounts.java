package Arrayproblem;
import java.util.Scanner;
public class DiffCounts {
	private static void diffCounts(String s) {
		int nc = 0,cc=0,vc=0,sc=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0'&&ch<='9') {
				nc++;
			}
			else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U') {
					vc++;
				}else {
					cc++;
				}
				
			}
			else {
				sc++;
			}
		
		}
		System.out.println("nc "+ nc);
		System.out.println("vc "+ vc);
		System.out.println("cc "+ cc);
		System.out.println("sc "+ sc);

		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the string");
		String s = scan.nextLine();
		diffCounts(s);
	}



}

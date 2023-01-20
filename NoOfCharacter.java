package java_program;

import java.util.Scanner;

public class NoOfCharacter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		int a[] = new int[s2.length()];

		for(int i = 0;i<s2.length();++i) {
			for(int j = 0;j<s1.length();++j) {				
				
				if(s1.charAt(j) == s2.charAt(i)) {
					
					a[i] = a[i]+1;
				}
			}
		}
		for(int i = 0 ;i<s2.length();++i) {
			
			System.out.print(s2.charAt(i) +":"+a[i]+" ");
		}
	}
}

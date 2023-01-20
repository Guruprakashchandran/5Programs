package java_program;

import java.util.Scanner;

public class SuperString {

	public static int super1(char a[],char b[]) {
		
		boolean bool = false;
		for(int i = 0;i<b.length;++i) {
			
			for(int j = 0;j<a.length;++j) {
				
				if(a[j] == b[i]) {
				
					a[j] = '1';
					bool = true;
					break;
				}
			}
			if(bool == false) {
				
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		//SuperString SuperString = new SuperString();
		Scanner scan = new Scanner(System.in);
		System.out.print("length : ");
		int length = scan.nextInt();
		String s1[] = new String[length];
		for(int i = 0;i<s1.length;++i) {
			
			s1[i] = scan.nextLine();
		}
		scan.nextLine();
		int length1 = scan.nextInt();
		scan.nextLine();
		String s2[] = new String[length1];
		for(int i = 0;i<s2.length;++i) {
			
			s2[i] = scan.nextLine();
		}
		int count = 0,count1 =0;
		for(int i = 0;i<s1.length;++i) {
			
			char a[] = new char[s1[i].length()];
			//a = sort();
			count = 0;
			for(int j = 0;j<s2.length;++j) {
				
				char b[] = new char[s2[j].length()];
				count += super1(s1[i].toCharArray(),s2[j].toCharArray());
				if(count  == 0) {
					
					break;
				}
			}
			if(count == s2.length) {
				
				count1++;
			}
		}
		System.out.println("count : "+count1);
	}
}

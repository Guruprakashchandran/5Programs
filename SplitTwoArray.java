package java_program;

import java.util.Scanner;

public class SplitTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length =scan.nextInt();
		int a[] = new int[length];
		int total=0;
		int b[] = new int[length]; 
		int c[] = new int[length];
		int b1 = 0,c1 = 0;
		for(int i = 0;i<a.length;++i) {
			
			a[i] = scan.nextInt();
			total += a[i];
		}
		if(total % 2 != 0) {
			
			System.out.println("Do not Split two Array");
		}
		else {
			
			for(int i = 0;i<length;++i) {
				
				for(int j = i+1;j<length;++j) {
					
					if(a[i] > a[j]) {
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			int value = total/2;
			for(int i = a.length-1;i>=0;--i) {
				if(a[i]<=value) {
					
					
					if(value == a[i]) {
						
						b[b1++] = a[i];
						value -= a[i];
						a[i] = Integer.MAX_VALUE;
						break;
					}
					else {
						
						b[b1++] = a[i];
						value = value - a[i];
						a[i] = Integer.MAX_VALUE;
					}
				}
			}
			if(value == 0) {
				value = total/2;
				for(int i = 0;i<length;++i) {
				
					if(a[i]!= Integer.MAX_VALUE) {
						
						c[c1++] = a[i]; 
					}
				}
				System.out.println("1 Array");
				for(int i = 0;i<b1;++i) {
					System.out.println("v "+b[i]);
				}
				System.out.println("2 Array");
				for(int i = 0;i<c1;++i) {
					System.out.println(c[i]);
				}
			}
			else {
				
				System.out.println("Cant Split two Arrays");
			}
		}	
		scan.close();
	}
}

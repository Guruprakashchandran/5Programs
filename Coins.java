package java_program;

import java.util.Scanner;

public class Coins {

	public int coin(int total_Amount,int a[]) {
		
		int max = 0;
		for(int i = 0;i<a.length;++i) {
			
			if((total_Amount % a[i]) == 0) {
				
				
				if(max<a[i]) {
					
					max = a[i];
				}
			}
		}
		if(max != 0) {
			
			return max;
		}
		else {
			
			return -1;
		}
	}
	public static void main(String[] args) {
		
		Coins c = new Coins();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Total Amount : ");
		int total_Amount = scan.nextInt();
		System.out.print("Enter Length : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<a.length;++i) {
			
			a[i] = scan.nextInt();
		}
		System.out.println("Output : "+c.coin(total_Amount,a));
	}
}

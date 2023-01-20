package java_program;

import java.util.Scanner;
import java.util.Stack;

public class BalancingInExpression {
public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		boolean bool = false;
		for(int i = 0;i<s.length();++i) {
		
			System.out.println(s.charAt(i));
			if(s.charAt(i) == '(') {
				
				stack.push(s.charAt(i));
			}
			else if((s.charAt(i) >= 'A'&& s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				
				if(i+1 < s.length() && ((s.charAt(i+1) >= 'A'&& s.charAt(i+1) <= 'Z') || (s.charAt(i+1) >= 'a' && s.charAt(i+1) <= 'z'))) {
					
					bool = true;
					System.out.println("invalid");
					break;
					
				}
				else {
					
					continue;
				}
			}
			else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
				
				if(i-1>-1 && i+1<s.length() && ((s.charAt(i + 1) >= 'a' && s.charAt(i+1) <= 'z') || (s.charAt(i + 1) >= 'A' && s.charAt(i+1) <= 'Z')) &&((s.charAt(i - 1) >= 'a' && s.charAt(i-1) <= 'z') || (s.charAt(i - 1) >= 'A' && s.charAt(i-1) <= 'Z'))) {
					
					continue;
				} 
				else {
					
					System.out.println("Invalid");
					bool = true;
					break;
				}
			}
			else {
				
				if(stack.isEmpty()) {
					
					System.out.println("invalid");
					break;
				}
				else {
					
					stack.pop();
				}
			}
		}
		if(stack.isEmpty() ) {
			
			if( bool == false) {
				System.out.println("valid");
			}
		}
		else if(bool == false){
				System.out.println("Invalid");
		}
		scan.close();
	}
}

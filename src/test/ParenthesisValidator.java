package test;

import java.util.Stack;

public class ParenthesisValidator {

	public static void main(String[] args) {
		String s1 = "(){}[]";
		String s2 = "([{}])";
		String s3 = "([]{})";
		String s4 = "(]";
		String s5 = "(()]";
		
		print(s1);
		print(s2);
		print(s3);
		print(s4);
		print(s5);

	}
	
	public static void print(String str) {
		
		if(validate(str)) {
			System.out.println(str +" -> " +"valid");
		}else {
			System.out.println(str +" -> " +"invalid");
		}
	}
	public static boolean validate(String str) {
		
		Stack<Character> stk = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			
			switch(ch) {
			case '{':
			case '[':
			case '(':
				stk.push(ch);
				break;
			case '}':
				if(stk.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if(stk.pop() != '[') {
					return false;
				}
				break;
			case ')':
				if(stk.pop() != '(') {
					return false;
				}
				break;
			}
		}
		
		return stk.isEmpty();
		
	}
}

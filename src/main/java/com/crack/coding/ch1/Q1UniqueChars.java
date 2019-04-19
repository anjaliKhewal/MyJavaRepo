package com.crack.coding.ch1;

import java.util.HashSet;
import java.util.Set;

//Implement an algorithm to determine if a string has all unique characters. 
//What if you cannot use additional data structures?
public class Q1UniqueChars {
	
	public static void main(String[] args) {
		//checkUniqueChars();
		
		boolean res = updatedMethodForUniqueCheck(input);
		
		System.out.println("The string '"+input+"' has all unique chars: "+res);
	}
	
	private static String input = "abcdzxnhkl";
	private static Set unqSet = new HashSet();
	
	public static void checkUniqueChars() {
		
		boolean[] charSet = new boolean[128];
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			//using set
			boolean check = unqSet.add(ch);
			
			//ascii of ch
			int j = ch;
			System.out.println("char: "+ch+" ASCII: "+j);
			//if(check==false) {
				//System.out.println("duplicate char is: "+ch);
				//break;
				
			//}
						
			if(charSet[ch]) {
				System.out.println("charset bool: "+ch);
				break;
			}
			charSet[ch] = true;
			
		}		
		
	}
	
	public static boolean updatedMethodForUniqueCheck(String input) {
		
		if(input.length()>128) {
			return false;
		}
		
		boolean[] charSet = new boolean[128];
		for(int i=0;i<input.length();i++) {
			int val = input.charAt(i);
			
			if(charSet[val]) {
				return false;
			}
			
			charSet[val] = true;
		}
		
		return true;
	}

}

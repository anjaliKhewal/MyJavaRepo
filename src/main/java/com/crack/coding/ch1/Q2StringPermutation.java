package com.crack.coding.ch1;

import java.util.Arrays;

public class Q2StringPermutation {
	
	public static void main(String[] args) {
		String s1="abcacs";
		String s2="abacca";
		boolean res=permutation(s1,s2);
		System.out.println("** Test 1 ** \nString s1 and s2 are permutations of each other: "+res);
		//boolean res2 = permutationDebug(s1,s2);
		//System.out.println("** Test 2 ** \nString s1 and s2 are permutations of each other: "+res2);
		
		boolean res3 = permutationFinal(s1,s2);
		System.out.println("** Test 3 ** \nString s1 and s2 are permutations of each other: "+res3);
	}
	
	

	public static String sort(String s1) {
		char[] content = s1.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	//solution 1 for permutation
	public static boolean permutation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		boolean res = sort(s1).equals(sort(s2));
		
		return res;
		
	}
	
	//solution 2 for permutation
	
	public static boolean permutationDebug(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		
		int[] letters = new int[128];
		
		char[] s1Char = s1.toCharArray();
		//char[] ch = new char[128];
		for(char c: s1Char) {
						//System.out.println(c);
						//int j = letters[c]++;
						//System.out.println("c++ "+c++);ch[c]=c;
						//System.out.println("ch.c "+ch[c]++);
						//ch[c]++;
			
			//increment the value at index of c, capturing occurrence of char
			//letters[c]+=1;
			letters[c]++;
			System.out.println("value at "+c+" "+letters[c]);
			
		}
		char[] s2Char = s2.toCharArray();
		for(char c: s2Char) {
			//string length should be same, means similar number of addition and reduction will happen
			//remove the added value as per second string
			//it will return -1 if the value was never added and only reduced,
			//it will return -1 if the vlaue was added 2 times and tried to remove more than that
			
			//letters[c]-=1;
			letters[c]--;
			System.out.println("removed "+c+" "+letters[c]);
			//value which is never added
			//System.out.println("value "+letters[122]);
			if(letters[c]<0) {
				System.out.println(letters[c]);
				return false;
			}
		}
		
		return true;
	}
	
	//soln 3 for permutation
	private static boolean permutationFinal(String s1, String s2) {
		if(s1.length()!=s2.length())
		return false;
		
		int[] letters = new int[128];
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		for(char c:ch1) {
			
			letters[c]++;
		}
		
		for(char c:ch2) {
			
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		return true;
	}
}

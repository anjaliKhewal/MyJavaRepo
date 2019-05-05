package com.crack.coding.ch1;

public class Q5OneAway {

	public static void main(String[] args) {
		
		String str1 = "pale";
		String str2 = "pae";
		
		boolean res = isOneAway(str1, str2);
		
		System.out.println("These two strings are one away: "+res);
		
	}
	
	public static boolean isOneAway(String str1, String str2) {
		
		int[] test = new int[128];
		int count =0;
		
		int[] test2 = new int[128];
		int count2 = 0;
		if(str1.length()==str2.length()){
				
			for(char c:str1.toCharArray()) {
				
				if(test[c]==0)
					test[c]++;
										
			}
			
			for(char c: str2.toCharArray()) {
				
					test[c]--;
					
				if(test[c]<0)
					count++;
			}
			System.out.println("Strings of same length, away number: "+count);
			if(count==1)
				return true;
			
		}else if(str1.length()+1==str2.length() || str1.length()-1 == str2.length()) {
			
			String longtStr = null;
			String shortStr = null;
			
			if(str1.length()>str2.length()) {
				longtStr = str1;
				shortStr = str2;
			}else {
				longtStr = str2;
				shortStr = str1;
			}
			for(char c:shortStr.toCharArray()) {
				
				if(test2[c]==0)
					test2[c]++;
				
			}
			
			for(char c: longtStr.toCharArray()) {
				test2[c]--;
				
				if(test2[c]<0)
					count2++;
				
			}
			
			System.out.println("Strings of different length, away number: "+count2);
			if(count2==1)
				return true;
			
		
		}
		
		return false;
	}
}

package com.crack.coding.ch1;

import java.util.ArrayList;
import java.util.List;

public class Q6StringCompression {
	
	public static void main(String[] args) {
		
		String str = "aabcdeeeeeennnnnnnnnnmm";
		
        String in = compression(str);
		System.out.println("compressed string: "+in);
		
	}
	
	public static String compression(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		
		int strlen = str.length();
		
		for(int i=0;i<str.length();i++) {
			
			if(i<strlen-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				/*if(i+1==strlen-1) {
				sb.append(str.charAt(i));
				sb.append(count);
				}*/
			}
			else {
				sb.append(str.charAt(i));
				sb.append(count);
				count=1;
				
			}	
			
			
		}
		System.out.println("res: "+sb);
		
		String sbstr = new String(sb);
			
		
		return sb.length()-strlen<0?sbstr:str;
	}
	
	

}

package com.study.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n = fact(0);
		System.out.println(n);
				
	}
	
	
	public static int fact(int n) {
		
		
		if(n==0)
			return 1;
		
		else if(n>0)
			n = n*fact(n-1);	
		
		return n;
	}

}

package com.crack.coding.ch1;

public class Q3URLify {
	
	private static String input = " Mr 3ohn Smith ";
	public static void main(String[] args) {
		
		System.out.println("update url: "+input);
		int actualLength = input.length();
		System.out.println("actual length: "+actualLength);
		
		int lengthNeeded = calLength(input, actualLength);
		System.out.println("length needed: "+lengthNeeded);
		
		char[] res = editString(input,lengthNeeded);
		System.out.println(res);
	
	}
	
	public static int calLength(String input, int actualLength) {
		int addLen = 0;
		for(char c: input.toCharArray()) {
			if(c==' ')
				addLen++;
		}
		return addLen*2+actualLength;
	}
	
	public static char[] editString(String input, int len) {
		
		char[] ch1 = input.toCharArray();
		char[] ch2 = new char[len];
		int index =0;
		for(int i=0; i<ch1.length;i++) {
			
			if(ch1[i]!=' ') {
				ch2[index]=ch1[i];
				index++;
			}
			else if(ch1[i]==' ') {
				ch2[index] ='%';
				ch2[index+1]='2';
				ch2[index+2]='0';
				index+=3;
			}
			
		}
		
		return ch2;
	}

}

package com.leetcode;

public class Ques709_ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques709_ToLowerCase ques = new Ques709_ToLowerCase();
		
		String res = ques.toLowerCase("HELloWOrlD");
		System.out.println(res);
		

	}
	
	 public String toLowerCase(String str) {
		 
	     StringBuffer sb = new StringBuffer();
		 for(int i=0;i<str.length();i++) {
			 
			 int c = str.charAt(i);
			 char ch=str.charAt(i);
			 //ASCII code of A-Z = 65 (A) to 90 (Z)
			 //ASCII code of a-z = 97 (a) to 122 (z)
			 //need to add = 26(alphabets + 6 extra chars between Z and a)
			 if(c>64 && c<91)
				  ch = (char) (c+32);
			 
			 sb.append(ch);
			 
		 }
		 return sb.toString();
	    }

}

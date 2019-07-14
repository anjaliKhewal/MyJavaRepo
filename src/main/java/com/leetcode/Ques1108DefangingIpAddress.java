package com.leetcode;

public class Ques1108DefangingIpAddress {
	
	public static void main(String[] args) {
		
		Ques1108DefangingIpAddress obj = new Ques1108DefangingIpAddress();
		
		String result = obj.defangIPaddr("1.1.1.1");
		
		System.out.println(result);
	}
	
	public String defangIPaddr(String address) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<address.length();i++) {
			String str = null;
			if(address.charAt(i)=='.') {
				str ="[.]";
				
			}
			if(str!=null) {
			sb.append(str);
			str=null;
			}
			else {
				sb.append(address.charAt(i));
			}
			
			//result = result.concat(address.charAt(i));
			
		}
		
		//System.out.println(sb);
		String strres = new String(sb);
        
		return strres;
    }

}

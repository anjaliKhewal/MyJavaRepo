/**
 * @author Anjali
 *Apr 23, 2019
 *
 */
package com.crack.coding.ch1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//if the given string is a permutation (catacot is a permutation since it has 
// 2 c 2 t 2 a and 1 o) of a palindrome (tacocat)
public class Q4PalindromePermutation {


	public static void main(String[] args) {
		String str = "aabbccca";
		boolean res = isPermutation(str);
		System.out.println("\nThe string is a permutation of a palindrome: "+res);
		
	}
	
	private static boolean isPermutation(String str) {
		Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		if(str.length()%2==0)
			System.out.println("since the string \""+str+"\" is of even length, all the characters should be of even count");
		else
			System.out.println("since the string \""+str+"\" is of odd length, all the charactes should be of odd count");
		int val =1;
		int[] charArr = new int[128];
		for(char c:str.toCharArray()) {
			charArr[c]++;
			if(charMap.containsKey(c)) {
				
			  charMap.put(c,charMap.get(c)+1);
			}
			else
				charMap.put(c, val);
		}
		//using map
		Iterator<Map.Entry<Character,Integer>> it= charMap.entrySet().iterator();
		while(it.hasNext()) {
		//	Map.Entry entry = (Map.Entry)it2.next();
			Map.Entry et = (Entry) it.next();
			//et.getValue();
			//et.getKey();
			
		}
		int countOdd = 0;
		for(HashMap.Entry<Character,Integer> entry : (charMap.entrySet())) {
			if(entry.getValue()%2==1) {
				countOdd++;
			
			}
			if(countOdd>1);
				//return false;
		}
		//using character array
		int oddChar =0;
		for(int i: charArr) {
			if(i%2==1) {
				
				oddChar++;
				
			}
		}
		System.out.println("odd count: "+countOdd);
		System.out.println("odd count char arr: "+oddChar);
		
		if(oddChar>1) {
			return false;
		}
		
		
		return true;
	} 
}


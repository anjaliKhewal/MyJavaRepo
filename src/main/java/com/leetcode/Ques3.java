/**
 * @author Anjali
 *Dec 11, 2018
 *
 */
package com.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to longest substring problem!");
		System.out.println("Enter any string:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Entered string: "+str);
		String string = br.readLine();
		//String string = "abcdacekjfk";
		//String string = "abcdaekjfikl";
		System.out.println("String entered is: "+string);
		int counter = 0;
		List stringList = new ArrayList();
		//System.out.println(string.substring(0, 1));
		HashMap<Object, Integer> stringMap = new HashMap<>();
		HashMap<String, Integer> substr = new HashMap<>();
		HashMap<Object, Integer> lastIndex = new HashMap<>();
		HashMap<Integer,String> longestStr = new HashMap<>();
		for(int i=0; i<string.length();i++) {
			stringList.add(string.charAt(i));
			//System.out.println(string.substring(i,i+1));
						
		}
		int startIndex = 0;
		int longestLength =0;
		String ansSubStr = null;
		System.out.println(stringList);
		
		for(int i=0; i<stringList.size();i++) {
			if(i+1<stringList.size() && (stringList.get(i)!=stringList.get(i+1) || 
					!stringMap.containsKey(stringList.get(i)))) {
				if(stringMap.containsKey(stringList.get(i))) {
					int value = stringMap.get(stringList.get(i));
					int oldIndex = lastIndex.get(stringList.get(i));
					String sub = string.substring(oldIndex+1,i+1);
					startIndex = oldIndex+1;
					//substr.put(sub, sub.length());
					stringMap.put(stringList.get(i), value+1);
					lastIndex.put(stringList.get(i), i);
					
				}else {
					//int oldIndex = lastIndex.get(stringList.get(i));
					String sub = string.substring(i,i+1);
					//substr.put(sub, sub.length());
					stringMap.put(stringList.get(i), 1);
					lastIndex.put(stringList.get(i),i);
				}
				
				String sub = string.substring(startIndex,i+1);
				substr.put(sub, sub.length());
				if(longestLength==0||longestLength<sub.length()) {
					//longestStr.put(sub.length(),sub);
					longestLength = sub.length();
					ansSubStr = sub;
				}
			//add login for longestlength >=	
				
			}else if(i+1>=stringList.size()) {
				continue;
			}else {
				if(stringMap.containsKey(stringList.get(i))) {
					int value = stringMap.get(stringList.get(i));
					stringMap.put(stringList.get(i), value++);
					
				}else {
					stringMap.put(stringList.get(i), 1);
				}
			}
			
		}
		
		/*Iterator it = stringMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println("map values: "+entry.getKey()+" "+entry.getValue());
		}*/
		
		/*Iterator it2 = lastIndex.entrySet().iterator();
		
		System.out.println("Last Indices: ");
		while(it2.hasNext()) {
			Map.Entry entry = (Map.Entry)it2.next();
			System.out.println("map values: "+entry.getKey()+" "+entry.getValue());
		}*/
		
		/*Iterator it3 = substr.entrySet().iterator();
		
		System.out.println("All substr: ");
		while(it3.hasNext()) {
			Map.Entry entry = (Map.Entry)it3.next();
			System.out.println("map values: "+entry.getKey()+" "+entry.getValue());
		}*/
		
		/*Iterator it4 = longestStr.entrySet().iterator();
		
		System.out.println("Longest substr: ");
		while(it4.hasNext()) {
			Map.Entry entry = (Map.Entry)it4.next();
			System.out.println("map values: "+entry.getKey()+" "+entry.getValue());
		}*/
		
		System.out.println("Longest substr: "+ansSubStr+" length: "+longestLength);
		
	}
	
	

}


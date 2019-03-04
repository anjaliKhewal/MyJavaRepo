/**
 * 
 */
package com.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Anjali
 *
 */
public class SearchUniqueCharacter {


	public static void main(String[] args) {
		
		String sentence="Hello World in java";
	
		System.out.println("Unique characters and their count in the sentence : "+"\""+sentence+"\"");
		//Map<Object, Integer> map = new HashMap<>();//display in random fashion
		Map<Object, Integer> map = new TreeMap<>();//display in insertion fashion
	
		for(int i=0; i<sentence.length();i++){
			char ch = sentence.charAt(i);
					
			Set st = map.keySet();
			if(st.contains(ch)){
				int val = map.get(ch);
				val++;
				map.put(ch, val);
			}
			else{
				map.put(ch, 1);
			}
						
		}
		
		Iterator<Map.Entry<Object, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<Object, Integer> entity = it.next();
		
			System.out.println("unique char: "+entity.getKey()+ " count: "+entity.getValue());
			
		}
			
	}	
}

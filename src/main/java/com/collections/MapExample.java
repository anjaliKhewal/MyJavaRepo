/**
 * @author Anjali
 *Apr 23, 2019
 *
 */
package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map charMap = new HashMap();
		
		//using map
		//Iterator<Map.Entry<Character,Integer>> it= charMap.entrySet().iterator();
				Iterator it = (Iterator) charMap.entrySet();
				while(it.hasNext()) {
				//	Map.Entry entry = (Map.Entry)it2.next();
					Map.Entry et = (Map.Entry)it.next();
					//et.getValue();
					//et.getKey();
				}
	}

}


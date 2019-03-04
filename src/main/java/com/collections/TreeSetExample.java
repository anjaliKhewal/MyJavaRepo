/**
 * 
 */
package com.collections;

import java.util.TreeSet;

/**
 * @author Anjali
 * Dec 17, 2018
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1208);
		times.add(1850);
		times.add(2130);
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet)times.headSet(1850);
		System.out.println("J5 last time: "+subset.last());

	}

}

class Ferry{
	
}

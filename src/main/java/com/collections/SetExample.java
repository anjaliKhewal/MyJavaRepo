/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] bol = new boolean[6];
		 
		Set s = new HashSet();
		
		bol[0] = s.add(12);
		bol[1] = s.add("a");
		bol[2] = s.add(new Integer(24));
		bol[3] = s.add("b");
		bol[4] = s.add("a");
		bol[5] = s.add(new Object());
		
		Set s2 = new HashSet();
		s2.addAll(s);
		System.out.println("Print boolean array: ");
 		for(int i=0; i<bol.length;i++)
 			System.out.println(i+" "+bol[i]);
		
		System.out.println("Print set s: ");
		for(Object o:s)
			System.out.println(o);
		
		//System.out.println(s);
		
		System.out.println("Print set s2: ");
		Iterator it = s2.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		Set s3 = new LinkedHashSet();
		
		s3.add("hello");
		s3.add("world");
		s3.add("India");
		s3.add("Universe");
		
		System.out.println("Linked HashSet");
		for(Object s7:s3)
			System.out.println(s7+" "+s3.size());
	}

}


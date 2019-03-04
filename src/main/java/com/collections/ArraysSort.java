/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArraySorting 
		String[] array = {"xyz","hello","abc","world","universe","hi"};
	/*	System.out.println(array[1]);
		for(String s: array) {
			System.out.println(s);
		}*/
		//System.out.println("\nSerached element position = "+ Arrays.binarySearch(array, "hi"));
		
		Arrays.sort(array);
		System.out.println("Arrays after sorting: ");
		for(String s: array) {
			System.out.println(s);
		}
		
		//array searching
		
		System.out.println("\nSerached element position = "+ Arrays.binarySearch(array, "xyz"));
		
		//Reverse sorting now
		ReSortComparator rs = new ReSortComparator();
		Arrays.sort(array, rs);
		
		System.out.println("Reverse sorted array: ");
		for(String s:array)
			System.out.println(s);
		
		//reverse sorted array but we didn't pass the reverese sort comparator so wrong result
		System.out.println("\nSerached element position = "+ Arrays.binarySearch(array, "hi"));
		//for reverse sorted array the comparator is passed hence getting correct result for the search
		System.out.println("\nSerached element position = "+ Arrays.binarySearch(array, "hi",rs));
	}

}

class ReSortComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		return b.compareTo(a);
	}
	
	
}


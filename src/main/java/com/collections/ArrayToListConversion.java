/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"anjali","sumit","rayansh"};
		List list = Arrays.asList(arr);
		System.out.println(list);
		System.out.println("list size: "+list.size()+" Array length: "+arr.length);
		
		list.set(0,"Anjali");
		arr[2]="Ray";
		
		System.out.println("List: "+list);
		System.out.println("Array: ");
		for(String s:arr)
			System.out.println(s);
		
		System.out.println("list size: "+list.size()+" Array length: "+arr.length);
		
	}

}


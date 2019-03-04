/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int j=3;
		for(int i=0;i<3;i++)
			list.add(i);
		
		System.out.println("List: "+list);
		Object[] obj = list.toArray();
		Integer[] intArr = new Integer[3];
		intArr = list.toArray(intArr);
		
		System.out.println("Print int array\n");
		for(int i:intArr)
			System.out.println(i);
	}

}


package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuickQues {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(2);
		
		long num=list.stream().count();
		List ls = (List) list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(ls);
		
		System.out.println(num);
	}

}

package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamExample {

	public static void main(String[] args) {
		
		
		 List<AppleOrange> applels = Arrays.asList(
				new AppleOrange("red","sweet",100),
				new AppleOrange("green","sour",200),
				new AppleOrange("red","sweet",250));
		
		
		applels.stream()
		.forEach(a->System.out.println(a.getColor()));
		
		System.out.println("\nfilter function:\n");

		applels.stream()
		.filter(a ->a.getColor().equals("red"))
		.forEach(a->System.out.println(a.getColor()));
		
		
		Set<AppleOrange> appset = new HashSet();
		
		appset.add(new AppleOrange("red","sweet",100));
		appset.add(new AppleOrange("green","sweet",100));
		appset.add(new AppleOrange("blue","sweet",100));
		appset.add(new AppleOrange("purple","sweet",100));
		appset.add(new AppleOrange("green","sweet",100));
		
		System.out.println("\nsets\n");
		
		System.out.println(appset.stream().findFirst());
		
		appset.stream()
			.filter(a->a.getColor().equals("blue"))
			.forEach(a->System.out.println(a));
		
		System.out.println("\nlast line:\n");
		System.out.println(appset.stream()
			.filter(a->a.getColor().equals("green"))
			.count());
		
		appset.stream()
			.filter(a->a.getColor().equals("green"))
			.count();
			
		System.out.println("\nmaps:\n");
		Map<Integer,String> amap = new HashMap();
		
		amap.put(1, "anjali");
		amap.put(2, "anjali");
		amap.put(3, "anjali");
		amap.put(4, "sumit");
		amap.put(5, "sumit");
		
		amap.forEach((a,b)->System.out.println(a+" "+b));
		amap.forEach((key,value)->System.out.println(key+" "+value));
		
		
	}

}

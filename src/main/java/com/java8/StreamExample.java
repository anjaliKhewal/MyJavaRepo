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
		
		System.out.println("Stream function general operations are:\n");
		
		System.out.println("source --> filter --> sort --> map --> collect \n");
		
		
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
		
		System.out.println("*** map result *** "+amap);
		
		amap.forEach((a,b)->System.out.println(a+" "+b));
		amap.forEach((key,value)->System.out.println(key+" "+value));
		//amap.forEach((key,value)->System.out.println("%s%s",key,value));
		
		System.out.println("\nArray Stream:\n");
		String[] names = {"anjali","sumit","anupma","amit","charu","rayansh"};
		
		Arrays.stream(names)
			.filter(x->x.startsWith("a"))
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("\nsubstitute of method reference in place of lambda expression\n");
		
		Arrays.stream(names)
		.filter(x->x.startsWith("a"))
		.sorted()
		.forEach(s->System.out.println(s));
		
		
	}

}

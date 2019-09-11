package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> dates = new ArrayList();
		dates.add("20 Oct 2052");
		dates.add("06 May 1960");
		
		dates.add("15 May 1912");
		
		dates.add("26 Dec 2018");
		
		dates.add("20 Oct 2052");
		//dates.add("20");

		List<String> out = sortDates(dates);
	}
	
	public static List<String> sortDates(List<String> dates){
		
		List<String> dateOutput = new ArrayList();
		Map<String, Integer> monMap = new HashMap();
		
		monMap.put("Jan", 1);
		monMap.put("Feb", 2);
		monMap.put("Mar", 3);
		monMap.put("Apr", 4);
		monMap.put("May", 5);
		monMap.put("Jun", 6);
		monMap.put("Jul", 7);
		monMap.put("Aug", 8);
		monMap.put("Sep", 9);
		monMap.put("Oct", 10);
		monMap.put("Nov", 11);
		monMap.put("Dec", 12);
		
		List<Integer> yearList = new ArrayList();
		List<Integer> dayList = new ArrayList();
		List<String> newDateList = new ArrayList();
		Map<String,Integer> yearSort = new HashMap();
		
		for(String date: dates) {
			
			
			if(date.length()<11)
				System.out.println(date);
			
			
			Integer day = Integer.parseInt(date.substring(0,2));
			dayList.add(day);
			
			String month = date.substring(3,6);
			
			String year = date.substring(7,11);
			
			Integer yearInt = Integer.parseInt(year);
		//	yearList.add(yearInt);
			String newDate = day+month+year;
			newDateList.add(newDate);
			System.out.println(newDate);
			
			yearSort.put(date,yearInt);
			
			
			
			
		}
		
		Iterator<Entry<String, Integer>> it = yearSort.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			
			
		}
		
		Collections.sort(dayList);
		System.out.println(dayList);
		Collections.sort(yearList);
		System.out.println(yearList);
		System.out.println(dates);
		return dateOutput;
	}

}

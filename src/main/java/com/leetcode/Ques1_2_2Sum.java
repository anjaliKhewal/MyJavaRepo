/**
 * 
 */
package com.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * @author Anjali
 *
 */
/*
 * Ques - Given an array of integers, return indices of the two numbers such 
 * that they add up to a specific target.
   You may assume that each input would have exactly one solution, 
   and you may not use the same element twice.
   
   Given nums = [2, 7, 11, 15], target = 9,

   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 * 
 * */
public class Ques1_2_2Sum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//inputs from command line program arguments
	/*	int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		System.out.println("target: "+int1+" "+ int2);*/
		System.out.println("Enter the length for integer array");
		
	
		//Input from the 
		   BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
		   /*String name = reader.readLine();
		   System.out.println("Name: "+ name);*/ 
		   int lenthOfArr= Integer.parseInt(reader.readLine());
		   
			System.out.println("Enter "+lenthOfArr+" numbers for the integer array: ");
			
			
		   int[] arr1= new int[lenthOfArr];
		   
		   for(int i=0;i<lenthOfArr;i++) {
			   arr1[i] = Integer.parseInt(reader.readLine());
		   }
		   
		   System.out.println("Entered array: ");
		   for(int i=0;i<arr1.length;i++) {
			  System.out.print(arr1[i]+" ");
		   }
		   System.out.println();
		   System.out.println("Enter target number: ");
		   int target = Integer.parseInt(reader.readLine());
		   
		   System.out.println("Entered target: "+target);
		   
		   //int[] output = twoSum(new int[8],9);
		   HashMap output = new HashMap();
		   
		  // output =  twoSum(arr1,target);
		   output = twoSumUsingMapsContainsKey(arr1, target);

	}
	
	public static HashMap twoSum(int[] nums, int target) {
		int length = nums.length;
	
		HashMap<Integer,Integer> output = new HashMap<>();
		HashMap<Integer,Integer> result = new HashMap<>();
			//needs improvement, use map.containsKey()
		for(int i=0;i<length;i++) {
			int remaining =0;
			remaining = target - nums[i];
			result.put(i,remaining);
	
			for(int j=i+1;j<length;j++) {
			
				if(result!=null && nums[j]==result.get(i)) {
					output.put(i, j);
				
				}else {
					
				}
			}	
		}
		System.out.println("output indices to get sum of numbers = "+target);
		
		Iterator it = output.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			//it.remove();
		}
		
		//lambda expression in Java 8 
		System.out.println("Output by lambda expression");
		output.forEach((key,value) -> System.out.println(key + " " + value));
	
		return output;
	}
	
	public static HashMap twoSumUsingMapsContainsKey(int[] nums, int target) {
		
		HashMap<Integer, Integer> inputMap = new HashMap();
		HashMap<Integer,Integer> output = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			inputMap.put(nums[i],i);
		}
		
		System.out.println("Input map");
		inputMap.forEach((key, value) -> System.out.println(key+" "+ value));
		
		for(int i =0;i<nums.length;i++) {
			int remaining = target - nums[i];
			if(inputMap.containsKey(remaining) && inputMap.get(remaining)!=i) {
			output.put(i, inputMap.get(remaining));
			}
		}
		System.out.println("output indices to get sum of numbers = "+target);
		output.forEach((key,value) -> System.out.println(key + " " + value));
		
		return output;
	}

}

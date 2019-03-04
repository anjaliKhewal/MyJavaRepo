/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;


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
public class Ques1 {
	

	static int[] intArr = {1,2,3,4,7,8,5,6};
	static int target = 9;
	
	public static void main(String[] args) {
		
		
		int length = intArr.length;
		System.out.println("Length of string: "+length);
		
		List output = new ArrayList();
		int j=0;
		int tmp=0;
		int skip=-1;
		
		for(int i=0; i<length; i++){
			if(i!=skip){
			tmp = target - intArr[i];
			for(int k =i+1; k<length; k++){
				if(tmp == intArr[k]){
					
					output.add(j, i);
					j++;
					output.add(j, k);
					j++;
					skip=k;
					
				}
				
			}
			
			}
			
		}
		
		for(int y=0; y<output.size();y=y+2){
	    System.out.println("Indices of two numbers: "+output.get(y)+", "+ output.get(y+1));
		}
	}

}

package com.leetcode;

public class Ques_PivotIndex {
	
	public static void main(String[] args) {
		int[] input = new int[5];
		int[] nums = {2,3,1,6,6};
		int result = getPivotIndex(nums);
		System.out.println("pivot index: "+result);
	}

	private static int getPivotIndex(int[] nums) {
		
		if(nums.length==0)
			return -1;
		
		int leftsum =0;
		int rightsum =0;
		
		for(int i=0,j=nums.length-1;i<nums.length;i++,j--) {
			
			if(i==j) {
			 if(leftsum==rightsum)
				 return i;
			
			}
			
			leftsum = leftsum + nums[i];
			rightsum = rightsum + nums[j];
			
			if(leftsum == rightsum)
				return i;
			
		}
		
		return -1;
	}

}

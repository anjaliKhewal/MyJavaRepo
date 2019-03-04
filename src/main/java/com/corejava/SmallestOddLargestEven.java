/**
 * 
 */
package com.corejava;

/**
 * @author Anjali
 *
 */

//Infosys Interview question very basic 
//to find the least odd number and maximum even number from an integer array

public class SmallestOddLargestEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1= {100,53,93,5,6,2,112,3,4,8,9,0,-10};
	
		int smallestOdd =0;
		int largestEven = 0;
		int evenTemp = 0;
		int oddTemp = 0;
		
		for(int i=0; i<ar1.length;i++){
			//System.out.println("Mod: "+ar1[i]%2);
			//System.out.println("Divide: "+ar1[i]/2);
			
			if(ar1[i]%2 == 0) {
				if(evenTemp==0) {
					largestEven = ar1[i];
					evenTemp++;
				}				
				if(largestEven<ar1[i])
				largestEven = ar1[i];
			
			}
		
			if(ar1[i]%2 == 1) {
				
				if(oddTemp ==0) {
					smallestOdd = ar1[1];
					oddTemp++;
				}
								
				if(smallestOdd>ar1[i])
				smallestOdd = ar1[i];
			}
			
			/*if(ar1[i]<smallestOdd ) {
				smallestOdd = ar1[i];
			}
			if(ar1[i]>largestEven) {
				largestEven = ar1[i];
			}*/
		}
		
		System.out.println("samllest odd: "+smallestOdd);
		System.out.println("largest even: "+largestEven);

	}

}

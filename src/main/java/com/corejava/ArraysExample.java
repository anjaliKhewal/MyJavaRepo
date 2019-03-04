/**
 * 
 */
package com.corejava;

/**
 * @author Anjali
 *
 */
public class ArraysExample {

	/**
	 * @param args
	 */
	
	/*
	 * Arary declaration:
	 * type var-name[];
		OR
		type[] var-name;
	 * */
	
	String sentence = "Hello World";
	char[] chrArray = {'a','b','z','f'};
	
	int[] intArray = {1,2,3,4,5,6,7};
	
	String[] strArray  = {"hello", "world"}; 
	
	int[] intArray1= new int[7];
	
	String[] strArray1 = new String[10];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysExample arrayExmaple = new ArraysExample();
		
		System.out.println("String array: "+ arrayExmaple.strArray[1]);
		System.out.println("Int array: "+ arrayExmaple.intArray.length);
		
		arrayExmaple.reverseArray(arrayExmaple.intArray);
		arrayExmaple.duplicateArray(arrayExmaple.intArray);
	}
	
	public void duplicateArray(int[] arr1) {
		int j=0;
		for(int i=0,k=0;i <arr1.length;i++,k++) {
			
			//intArray1[j]=arr1[i];
			intArray1[k]=arr1[i];
			j++;
				
		}
		
	System.out.println("Duplicate Array Output");
		
		for (int i=0; i<intArray1.length;i++) {
			
			System.out.println("elements at "+i+" is "+intArray1[i]);
		}
	}
	
	public void reverseArray(int[] arr1) {
		
		int j =0;
		
		for(int i=arr1.length-1,k=0;i>-1;i--,k++) {
			
			//for(int j=0;j<arr1.length;j++) {
				
				intArray1[k] = arr1[i];
				j++;
				
			//}
			
		}
		
		System.out.println("Reverse Array Output");
		
		for (int i=0; i<intArray1.length;i++) {
			
			System.out.println("elements at "+i+" is "+intArray1[i]);
		}
		
	}

}

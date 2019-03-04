/**
 * 
 */
package com.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Anjali
 * Jan 7, 2019
 */
public class PrintStars {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("enter the max number");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int countmax = Integer.parseInt(br.readLine());
		int countmax =4;
		//int j=0;
		int start =1;
		for(int i=1;i<countmax;i++) {
			//int j =i;
			//if(j!=0)
			start=1;
			//System.out.print(i);
				for(int j=1;j<=i;j++)
				{
					System.out.print(start);
					start++;
				}
				System.out.println("\n");
		}
	}

}

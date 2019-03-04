/**
 * 
 */
package com.corejava;

/**
 * @author Anjali
 * Jan 8, 2019
 */
public class InterfaceImplExample implements ABC, XYZ{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceImplExample ex = new InterfaceImplExample();
		ex.getMyName();
		System.out.println("age: "+age);
		
	}

	/* (non-Javadoc)
	 * @see com.corejava.ABC#getMyName()
	 */
	@Override
	public void getMyName() {
		
		System.out.println("hello I am inside get my name "+number);
		// TODO Auto-generated method stub
		
	}

}

/**
 * 
 */
package com.corejava;

/**
 * @author Anjali
 * Dec 17, 2018
 */
public class SingletonClass {

	private static SingletonClass SINGLE_INSTANCE = null;
	private SingletonClass() {}
	public static SingletonClass getInstance() {
		if(SINGLE_INSTANCE == null) {
			synchronized(SingletonClass.class) {
				SINGLE_INSTANCE = new SingletonClass();
			}
			
		}
		return SINGLE_INSTANCE;
	}
	

}

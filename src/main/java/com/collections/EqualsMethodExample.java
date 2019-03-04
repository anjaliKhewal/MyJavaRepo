/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

public class EqualsMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant p1 =  new Plant(4);
		Plant p2 = new Plant(4);
		
		if(p1.equals(p2))
			System.out.println("Plants 1 and 2 are eqaul");
		else 
			System.out.println("Plants are unequal");
	
	
		Tree t1 = new Tree(4);
		Tree t2 = new Tree(4);
		
		if(t1.equals(t2))
			System.out.println("Trees 1 and 2 are eqaul");
		else
			System.out.println("Trees are uneqaul");
			
	}
}

class Plant{
	
	private int noOfLeaves;

	public Plant(int noOfLeaves) {
		super();
		this.noOfLeaves = noOfLeaves;
	} 
	
	public boolean equals(Object o) {
		if(o instanceof Plant && ((Plant) o).getNoOfLeaves()==this.getNoOfLeaves()) {
			return true;
		}else return false;
	}

	/**
	 * @return the noOfLeaves
	 */
	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	/**
	 * @param noOfLeaves the noOfLeaves to set
	 */
	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}
	
}

class Tree{
	 private int noOfLeaves;
	 
	 public Tree(int noOfLeaves) {
		 this.noOfLeaves = noOfLeaves;
	 }

	/**
	 * @return the noOfLeaves
	 */
	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	/**
	 * @param noOfLeaves the noOfLeaves to set
	 */
	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}
	 
	 
}


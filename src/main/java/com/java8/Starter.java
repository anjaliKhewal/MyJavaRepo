/**
 * 
 */
package com.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anjali
 *
 */
public class Starter{

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println("Comparator sort example using Java 8");
		
		List<Apple> inventory = new ArrayList<>();
		
		inventory.add(new Apple("red",100));
		inventory.add(new Apple("green",150));
		inventory.add(new Apple("yellow",200));
		
		System.out.println(" List before sort "+inventory);
		inventory.sort((Apple a1, Apple a2)->a1.getColor().compareTo(a2.getColor()));
		
		System.out.println("List after sort "+inventory);
		
		System.out.println("List the apples with red color");
		
		List<Apple> result = filterApples(inventory,(Apple apple)->"red".equals(apple.getColor()));
		System.out.println(result);

	}

	private static List<Apple> filterApples(List<Apple> inventory, AppleInterface<Apple> object) {
		List<Apple> app = new ArrayList<>();
				for(Apple a:inventory) {
					if(object.test(a))
						app.add(a);
				}
		return app;
	}


}

interface AppleInterface<Apple>{
	
	boolean test(Apple apple);
}



class Apple{
	
	private String color;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	private int weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @param color
	 * @param weight
	 */
	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
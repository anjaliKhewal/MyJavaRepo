package com.java8;

public class AppleOrange {
	
	private String color;
	private String flavor;
	private int weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public AppleOrange(String color, String flavor, int weight) {
		super();
		this.color = color;
		this.flavor = flavor;
		this.weight = weight;
	}
	public AppleOrange() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", flavor=" + flavor + ", weight=" + weight + "]";
	}
	
	

}

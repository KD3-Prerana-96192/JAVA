//package com.app.fruits;
//
//import java.util.Scanner;
//
//abstract class Fruit
//{
//	protected String color;
//	protected double weight;
//	protected String name;
//	protected boolean isFresh;
//	
//
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public boolean isFresh() {
//		return isFresh;
//	}
//
//	public void setFresh(boolean isFresh) {
//		this.isFresh = isFresh;
//	}
//
//	public Fruit(String color,double weight,String name,boolean isFresh)
//	{
//		this.color=color;
//		this.weight=weight;
//		this.name=name;
//		this.isFresh=isFresh;
//	}
//	
//	public void addFruit()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter color: ");
//		color=sc.next();
//		System.out.println("Enter weight: ");
//		weight=sc.nextInt();
////		System.out.println("Enter name: ");
////		String mango=sc.next();
//		isFresh=true;
//	}
//	@Override
//	public String toString()
//	{
//		return "color: "+color+"Weight: "+weight+"name: "+name+"isFresh: "+isFresh;
//	}
//	
//	abstract public String taste();
//	
//}


package com.app.fruits;

import java.util.Scanner;
abstract public class Fruit
{
	protected String color;
	protected double weight;
	protected String name;
	protected boolean isFresh;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	@Override
	public String toString() {
		
		return "Color: "+color+" Weight: "+ weight+" name: "+name+" isFresh: "+isFresh;
	}
	
	abstract public String taste();
	
}

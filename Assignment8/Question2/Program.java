package com.sunbeam;

import java.util.*;
public class Program {
	public static void main(String[] args) {
		
	List<String> list = new ArrayList<>();
	list.add("White");
	list.add("Yellow");
	list.add("Red");
	list.add("Black");
	list.add("Green");
	list.add("Purple");
	list.add("Pink");
	
	Collections.sort(list);
	for(String e : list) {
		System.out.println( e +" ");
	}
	}
}

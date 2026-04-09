package com.sunbeam;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int index=1;
		list.set(index, 90);
		for(Integer e : list) {
			System.out.println( e +" ");
		
	
	}
  }
}

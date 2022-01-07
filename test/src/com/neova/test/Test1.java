package com.neova.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
	public static void main(String[]arg) {
		System.out.println("Hello");
		ArrayList<Integer> list= new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(33);
		list.add(11);

		//System.out.println(list);
		
		HashSet<Integer> hset = new HashSet<Integer>(list);
		System.out.println(hset);
}
	private  int Equal(ArrayList<Integer>) str {
		
	}
	
}

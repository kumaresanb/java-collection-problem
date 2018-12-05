package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager {
	public static void main(String[] args) {
		 ArrayList list =new ArrayList();
		 list.add(90);
		 list.add("abc");
		 list.add("Hello");
		 list.add(100.34);
		 list.add('b');
		 list.add(true);
		 System.out.println(list);
		 System.out.println(list.get(3));
		 
		 for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		}
		System.out.println("-----------------"); 
		for (Object object : list) {
			System.out.println(object);
		}	
		
	}
}

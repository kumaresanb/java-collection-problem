package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager4 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(null);
		list1.add(null);
		/**
		 * Null pointer exception
		 */
		//Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList list2=new ArrayList();
		list2.add(90);
		list2.add(90);
		list2.add("abc");
		System.out.println(list2);
		/**
		 * Class cast exception we you add differnt type of element to array list.When we collections sort it will give CCE
		 */
		//Collections.sort(list2);
		//System.out.println(list2);
		
		
	}
}

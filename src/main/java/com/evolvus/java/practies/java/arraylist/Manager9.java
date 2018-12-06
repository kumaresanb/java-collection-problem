package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager9 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(8);
		list.add(4);
		list.add(100);
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(8);
		list1.add(4);
		list.removeAll(list1);
		System.out.println(list);
		ArrayList list2=new ArrayList();
		list2.add(90);
		list2.add(8);
		list2.add(4);
		list2.add(100);
		list2.add(0);
		list2.add(150);
		list2.add(120);
		list2.remove(2);
		System.out.println(list2);
	
	}
}

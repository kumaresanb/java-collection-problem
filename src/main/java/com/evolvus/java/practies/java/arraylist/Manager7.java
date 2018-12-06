package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager7 {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(90);
		list.add(4);
		list.add(8);
		list.add(100);
		ArrayList list1 =new ArrayList();
		list1.add(90);
		list1.add(4);
		list1.add(100);
		list1.add(10);
		System.out.println(list.containsAll(list1));
	}
}

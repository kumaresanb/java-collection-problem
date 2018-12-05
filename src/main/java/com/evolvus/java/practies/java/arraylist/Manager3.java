package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager3 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(0);
		list.add(90);
		ArrayList list1=new ArrayList();
		list1.add(0);
		list1.add(90);
		System.out.println(list==list1);
		System.out.println(list.equals(list1));
		System.out.println(list.hashCode());
		System.out.println(list1.hashCode());
	}
}

package com.evolvus.java.practies.java.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Manager8 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(90);
		list.add(90);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(100);
		list.add(100);
		ArrayList list1=new ArrayList(new HashSet(list));
		System.out.println(list1);
	}

}

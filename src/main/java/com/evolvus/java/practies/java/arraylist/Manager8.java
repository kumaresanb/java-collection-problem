package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Manager8 {

	public static void main(String[] args) {
		List list =new ArrayList();
		list.add(90);
		list.add(4);
		list.add(8);
		list.add(100);
		Object obj=list.remove(1);
		System.out.println(obj);
		System.out.println(list);
		boolean flag=list.remove(new Integer(8));
		System.out.println(flag);
		System.out.println(list);
	}

}

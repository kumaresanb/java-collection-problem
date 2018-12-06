package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager14 {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(190);
		list.add(910);
		list.add(290);
		ListIterator  it=list.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			Integer i1=(Integer) object;
			System.out.println(i1);
			
		}
		System.out.println("---------------");
		while (it.hasPrevious()) {
			Object object = (Object) it.previous();
			Integer i1=(Integer) object;
			System.out.println(i1);
			
		}
		System.out.println("---------------");
		while (it.hasNext()) {
			Object object = (Object) it.next();
			Integer i1=(Integer) object;
			System.out.println(i1);
			
		}
	}

}

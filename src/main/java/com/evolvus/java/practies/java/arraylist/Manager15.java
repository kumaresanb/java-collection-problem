package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager15 {
	public static void main(String[] args) {
			ArrayList list =new ArrayList();
			list.add(90);
			list.add(9);
			ListIterator listIterator=list.listIterator();
			listIterator.add(100);
			while (listIterator.hasNext()) {
				Object object = (Object) listIterator.next();
				Integer i1=(Integer)object;
				System.out.println(i1);
				
			}
			listIterator.add(20);
			System.out.println(list);
			System.out.println("----------");
			while (listIterator.hasPrevious()) {
				Object object = (Object) listIterator.previous();
				Integer i1=(Integer)object;
				System.out.println(i1);
				
			}
	}
}

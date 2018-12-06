package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager13 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(190);
		list.add(910);
		list.add(290);
		Iterator it  =list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			Integer i1=(Integer)object;
			if(i1.equals(910)) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}

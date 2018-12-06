package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager12 {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(910);
		list.add(29);
		Iterator it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		/**
		 * Iterator can be iterate only one time
		 */
		System.out.println("-------------------");
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}

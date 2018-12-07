package com.evolvus.java.practies.java.mapstream;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Manager4 {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(90);
		treeSet.add(9);
		treeSet.add(0);
		treeSet.add(100);
		treeSet.add(50);
		treeSet.add(60);
		System.out.println(treeSet);
		/**
		 * Ceiling method
		 */
		System.out.println("Ceiling method");
		Object obj = treeSet.ceiling(50);
		System.out.println(obj);
		Object obj1 = treeSet.ceiling(51);
		System.out.println(obj1);
		/**
		 * floor method
		 */
		System.out.println("Floor method");
		Object obj2 = treeSet.floor(50);
		System.out.println(obj2);
		Object obj3 = treeSet.floor(45);
		System.out.println(obj3);
		System.out.println("Descending Iterator");
		Iterator it = treeSet.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Descenfing set Function");
		Set set1=treeSet.descendingSet();
		System.out.println(set1);
		System.out.println("Head set Function");
		Set set2=treeSet.headSet(50);
		System.out.println(set2);
		System.out.println("Head set with boolean Function");
		Set set3=treeSet.headSet(50,true);
		System.out.println(set3);
		
		System.out.println("tail set with boolean Function");
		Set set4=treeSet.tailSet(50,true);
		System.out.println(set4);

	}

}

package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Manager7 {
	public static void main(String[] args) {
		HashSet hashSet =new HashSet();
		hashSet.add(90);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(50);
		hashSet.add(60);
		System.out.println(hashSet);
		System.out.println("Iterator");
		Iterator it=hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}

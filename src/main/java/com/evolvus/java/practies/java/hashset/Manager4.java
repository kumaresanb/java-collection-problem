package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class Manager4 {

	public static void main(String[] args) {
		 HashSet hashSet=new HashSet();
		 hashSet.add(90);
		 hashSet.add(9);
		 hashSet.add(20);
		 hashSet.add(15);
		 hashSet.add(30);
		 hashSet.add(25);
		 hashSet.add(80);
		// TreeSet treeSet=new TreeSet(hashSet);
		 TreeSet treeSet=new TreeSet();
		 treeSet.addAll(hashSet);
		 System.out.println(treeSet);
	}

}

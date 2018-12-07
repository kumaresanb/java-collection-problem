package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class Manager5 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(90);
		hashSet.add(9);
		hashSet.add(20);
		hashSet.add(15);
		hashSet.add(30);
		hashSet.add(25);
		hashSet.add(80);
		TreeSet  treeSet=new TreeSet();
		treeSet.add(90);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(35);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(25);
		treeSet.add(70);
		System.out.println(treeSet);
	}
}

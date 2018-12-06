package com.evolvus.java.practies.java.linkedlist;

import java.util.LinkedList;

public class Manager {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(90);
		linkedList.add(9);
		linkedList.add(0);
		linkedList.add(910);
		linkedList.add(400);
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList);
	}

}

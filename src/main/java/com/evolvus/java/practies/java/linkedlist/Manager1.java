package com.evolvus.java.practies.java.linkedlist;

import java.util.PriorityQueue;

public class Manager1 {
	
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add(90);
		queue.add(10);
		queue.add(0);
		queue.add(8);
		queue.add(12);
		queue.add(112);
		queue.add(120);
		queue.add(121);
		queue.add(132);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}

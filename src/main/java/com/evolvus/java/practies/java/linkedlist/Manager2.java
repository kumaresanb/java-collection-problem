package com.evolvus.java.practies.java.linkedlist;

import java.util.Collections;
import java.util.PriorityQueue;

public class Manager2 {
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue(10,Collections.reverseOrder());
		queue.add(90);
		queue.add(10);
		queue.add(11);
		queue.add(8);
		queue.add(112);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}

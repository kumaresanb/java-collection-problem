package com.evolvus.java.practies.java.linkedlist;

import java.util.Collections;
import java.util.PriorityQueue;

class A implements Comparable {
	int i;

	A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}

	public int compareTo(Object obj) {
		return i - ((A) obj).i;
	}
}

class Reverse implements Comparable {
	int i;

	Reverse(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}

	public int compareTo(Object obj) {
		return  i-((Reverse) obj).i;
	}
}

public class Manager3 {

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.add(new A(90));
		priorityQueue.add(new A(0));
		priorityQueue.add(new A(9));
		priorityQueue.add(new A(5));
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println("-----Reverse order queue------");
		PriorityQueue priorityQueue1 = new PriorityQueue(2, Collections.reverseOrder());
		priorityQueue1.add(new Reverse(90));
		priorityQueue1.add(new Reverse(0));
		priorityQueue1.add(new Reverse(9));
		priorityQueue1.add(new Reverse(5));
		System.out.println(priorityQueue1);
		System.out.println(priorityQueue1.poll());
		System.out.println(priorityQueue1);
		System.out.println(priorityQueue1.poll());
		System.out.println(priorityQueue1);
	}

}

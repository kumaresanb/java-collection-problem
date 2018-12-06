package com.evolvus.java.practies.java.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class  B{
	int i;
	B(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		return "i="+i;
	}
}

class SortBasedOnI implements Comparator{

	public int compare(Object o1, Object o2) {
		return ((A)o1).i-((A)o2).i;
	}
	
}

public class Manager4 {
	public static void main(String[] args) {
		PriorityQueue priorityQueue =new PriorityQueue(2,Collections.reverseOrder());
		priorityQueue.add(new A(90));
		priorityQueue.add(new A(0));
		priorityQueue.add(new A(0));
		priorityQueue.add(new A(9));
		priorityQueue.add(new A(5));
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);		
	}
}

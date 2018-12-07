package com.evolvus.java.practies.fifo;

import java.util.LinkedList;

class MyQueue {
	private LinkedList linkedList = new LinkedList();

	public void addToQeue(Object obj) {
		linkedList.add(obj);
	}
	public Object  removeFromQueue() {
		return linkedList.removeFirst();
	}
	public int size() {
		return linkedList.size();
	}
	@Override
	public String toString() {
		return linkedList.toString();
	}
}

public class Fifo {
	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue();
		myQueue.addToQeue(100);
		myQueue.addToQeue(10);
		myQueue.addToQeue(0);
		myQueue.addToQeue(90);
		myQueue.addToQeue(110);
		myQueue.addToQeue(20);
		myQueue.addToQeue(30);
		myQueue.addToQeue(40);
		System.out.println(myQueue);
		System.out.println("Size::"+myQueue.size());
		System.out.println(myQueue.removeFromQueue());
		System.out.println(myQueue);
		System.out.println("Size::"+myQueue.size());
	}

}

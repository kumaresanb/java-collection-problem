package com.evolvus.java.practies.lifo;

import java.util.LinkedList;

class MyStack {
	private LinkedList linkedList = new LinkedList();

	public void addToStack(Object obj) {
		linkedList.add(obj);
	}

	public Object removeFromStack() {
		return linkedList.removeLast();
	}

	@Override
	public String toString() {
		return linkedList.toString();
	}
}

public class Lifo {
	public static void main(String[] args) {
		MyStack myStack =new MyStack();
		myStack.addToStack(80);
		myStack.addToStack(100);
		myStack.addToStack(30);
		myStack.addToStack(10);
		System.out.println(myStack);
		System.out.println(myStack.removeFromStack());
		System.out.println(myStack);
	}

}

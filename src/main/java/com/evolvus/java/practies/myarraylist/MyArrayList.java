package com.evolvus.java.practies.myarraylist;

public class MyArrayList {

	private Object elements[];
	private int capacity;
	private int size;

	public MyArrayList() {
		capacity = 10;
		elements = new Object[capacity];
	}
	
	public MyArrayList(int capacity) {
		this.capacity=capacity;
		elements = new Object[capacity];
	}

	public void add(Object obj) {
		if (capacity == size) {
			alterCapacity();
		}
		elements[size++] = obj;
	}

	private void alterCapacity() {
		Object temp[] = elements;
		capacity = capacity * 2;
		elements = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
	}

	public int size() {
		return size;
	}
	
	public Object get(int index) {
		if(index<0||index>=size) {
			throw new ArrayIndexOutOfBoundsException("Index should be i betwwen 0 to"+(size-1));
		}
		return elements[index];
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i].toString()+",");
		}
		String s1=sb.substring(0,sb.length()-1);
		return s1.concat("]");
	}

}

package com.evolvus.java.practies.java.mapstream;

import java.util.HashMap;

class A {
	int i;

	A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}
	
}

class B {
	int j;

	B(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "j=" + j;
	}
	
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		return Integer.toString(j).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		return j==((B)obj).j;
	}
}



public class Manager2 {
	public static void main(String[] args) {
		HashMap<A, String> hashMap=new HashMap<A, String>();
		hashMap.put(new A(10), "hello");
		hashMap.put(new A(10), "hello");
		hashMap.put(new A(20), "hello");
		hashMap.put(new A(90), "hello");
		hashMap.put(new A(40), "hello");
		hashMap.put(new A(60), "hello");
		System.out.println(hashMap);
		System.out.println("IN B class overtide hashCode() and equals() ");
		HashMap<B, String> hashMap1=new HashMap<B, String>();
		hashMap1.put(new B(10), "xyzhello");
		hashMap1.put(new B(10), "xyzhello");
		hashMap1.put(new B(20), "xyzhello");
		hashMap1.put(new B(90), "xyzhello");
		hashMap1.put(new B(40), "xyzhello");
		hashMap1.put(new B(60), "xyzhello");
		System.out.println(hashMap1);
	}
}

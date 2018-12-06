package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class A implements Comparable {
	int i;

	A(int i) {
		this.i = i;
	}

	public int compareTo(Object obj) {
		A a = (A) obj;
		return i - a.i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}
}

public class Manager10 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new A(90));
		list.add(new A(0));
		list.add(new A(9));
		list.add(new A(910));
		list.add(new A(190));
		list.add(new A(920));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}

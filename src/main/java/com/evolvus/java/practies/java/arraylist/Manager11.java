package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class B {
	int i;

	public B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}
}

class SortBasedOnI implements Comparator {

	public int compare(Object o1, Object o2) {
		A a1 = (A) o1;
		A a2 = (A) o2;
		return a1.i - a2.i;
	}

}

public class Manager11 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new A(90));
		list.add(new A(0));
		list.add(new A(9));
		list.add(new A(910));
		System.out.println(list);
		Collections.sort(list, new SortBasedOnI());
		System.out.println(list);
	}
}

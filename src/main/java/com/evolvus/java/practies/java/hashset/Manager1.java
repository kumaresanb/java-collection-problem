package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;


class B{
	int i;
	B(int i){
		this.i=i;
	}
	@Override
	public String toString() {
		return "i="+i;
	}
	@Override
	public int hashCode() {
		System.out.println("B class Hashcode");
		return i;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("B class equals");
		return i==((B)obj).i;
	}
}


public class Manager1 {
	public static void main(String[] args) {
		HashSet  hashSet=new HashSet();
		System.out.println(hashSet.add(new B(90)));
		System.out.println(hashSet.add(new B(90)));
		System.out.println(hashSet.add(new B(90)));
		System.out.println(hashSet);
	}

}

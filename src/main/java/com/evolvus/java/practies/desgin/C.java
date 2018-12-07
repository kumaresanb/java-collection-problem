package com.evolvus.java.practies.desgin;

public class C {
	
	public static void main(String[] args) {
		Design d1 =Design.getInstance();
		Design d2 =Design.getInstance();
		Design d3 =Design.getInstance();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d1==d2);
	}

}

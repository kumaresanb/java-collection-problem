package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class Person implements Comparable {
	
	String name;
	int age;
	double weight;
	public Person(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
		
	public int compareTo(Object obj) {
		Person p=(Person) obj;
		return new Double(weight).compareTo(p.weight);
	}
	
	@Override
	public String toString() {
		return "Name="+name+" Age="+age+" Weigh="+weight;
	}
	
	public static void main(String[] args) {
		Person p1=new Person("kumar", 32, 81.6);
		Person p2=new Person("ravi", 28, 75.00);
		Person p3=new Person("ram", 22, 70.00);
		Person p4=new Person("anish", 21, 60.00);
		Person[] all= {p1,p2,p3,p4};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}
}

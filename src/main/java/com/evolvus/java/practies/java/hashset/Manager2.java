package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;

class Person{
	String name;
	int age;
	double weight;
	Person(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "["+"name="+name+","+"age="+age+","+"weight="+weight+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		int hash=name.hashCode();
		    hash+=Integer.toString(age).hashCode();
		    hash+=Double.toString(weight).hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		return name.equals(p.name)&&age==p.age&&weight==p.weight;
	}
}

public class Manager2 {
	public static void main(String[] args) {
		Person p1=new Person("kumar", 21, 89.00);
		Person p2=new Person("kumar", 21, 89.00);
		Person p3=new Person("ravi", 18, 50.00);
		Person p4=new Person("ravi", 18, 50.00);
		HashSet hashSet=new HashSet();
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		System.out.println(hashSet.size());
	}

}

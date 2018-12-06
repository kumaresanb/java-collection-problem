package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;

public class Manager5 {
	
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(90);
		list.add(80);
		list.add("abc");
		list.add("xyz");
		ArrayList list1 =new ArrayList();
		list1.addAll(list);
		list1.add(70);
		System.out.println(list1);
		ArrayList list2=new ArrayList();
		list2.add(90);
		list2.add(60);
		list2.add(1,"abc1");
		list2.add("abc2");
		ArrayList list3=new ArrayList();
		list3.add(50);
		list3.add(30);
		list3.add(1,list2);
		System.out.println(list3);
	}

}

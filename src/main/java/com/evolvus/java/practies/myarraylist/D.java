package com.evolvus.java.practies.myarraylist;

public class D {
	
	public static void main(String[] args) {
		MyArrayList myArrayList=new MyArrayList();
		myArrayList.add(90);
		myArrayList.add("abc");
		myArrayList.add(10000);
		myArrayList.add(10.23);
		myArrayList.add('x');
		System.out.println(myArrayList);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.get(4));
	}

}

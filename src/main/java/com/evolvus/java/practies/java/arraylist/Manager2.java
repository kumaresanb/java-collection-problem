package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Manager2 {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Abc");
		list.add("aBc");
		list.add("abC");
		list.add("ABC");
		list.add("JABC");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}

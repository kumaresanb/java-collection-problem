package com.evolvus.java.practies.java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager6 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner sc = new Scanner(System.in);
		String elements,decider;
		do {
			System.out.println("Enter the Elements");
			elements=sc.nextLine();
		    if(!list.contains(elements)) {
		    	list.add(elements);
		    }
		    System.out.println("Add one more element?(Y/N)");
		    decider=sc.nextLine();
		}while("Y".equals(decider));
		System.out.println("Array List:"+list);
	}
}

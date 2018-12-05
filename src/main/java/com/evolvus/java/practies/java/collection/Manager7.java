package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class Manager7 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 1000, 500.023);
		Book b2 = new Book("spring", 2000, 650.013);
		Book b3 = new Book("angularjs", 3000, 840.613);
		Book b4 = new Book("nodejs", 4000, 900.003);

		Book[] bll = { b1, b2, b3, b4 };
		System.out.println(Arrays.toString(bll));
		Arrays.sort(bll, new SortBasedOnTitle());
		System.out.println("Sort based in title------------------");
		System.out.println(Arrays.toString(bll));
		Arrays.sort(bll, new SortBasedOnPage());
		System.out.println("Sort based in page------------------");
		System.out.println(Arrays.toString(bll));
		Arrays.sort(bll, new SortBasedOnPrice());
		System.out.println("Sort based in price------------------");
		System.out.println(Arrays.toString(bll));
	}
}

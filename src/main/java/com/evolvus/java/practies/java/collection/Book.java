package com.evolvus.java.practies.java.collection;

public class Book {

	String title;
	int page;
	double price;

	public Book(String title, int page, double price) {
		this.title = title;
		this.page = page;
		this.price = price;
	}

	@Override
	public String toString() {
		String s1 = "title=" + title + "\n";
		s1 += "page=" + page + "\n";
		s1 += "price=" + price + "\n";
		return s1;
	}

}


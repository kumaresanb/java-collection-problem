package com.evolvus.java.practies.java.hashset;

import java.util.HashSet;

class Book{
	String title;
	String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		int hash=title.hashCode();
		    hash+=author.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		Book book=(Book)obj;
		return title.equals(book.title)&&author.equals(book.author);
	}
}
public class Manager3 {
	public static void main(String[] args) {
		Book b1=new Book("java", "kumar");
		Book b2=new Book("kumar", "java");
		HashSet  hashSet=new HashSet();
		hashSet.add(b1);
		hashSet.add(b2);
		System.out.println("Size::"+hashSet.size());
	}
}

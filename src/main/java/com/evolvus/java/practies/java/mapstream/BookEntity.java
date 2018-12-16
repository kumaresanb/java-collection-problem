package com.evolvus.java.practies.java.mapstream;

public class BookEntity {
	String bookName;
	int pageNo;
	
	@Override
	public String toString() {
		return "{"+"bookName:"+bookName+",pageNo:"+pageNo;
	}
	
	@Override
	public int hashCode() {
		return bookName.hashCode()+Integer.toString(pageNo).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return bookName==((BookEntity)obj).bookName&&pageNo==((BookEntity)obj).pageNo;
	}

}

package com.evolvus.java.practies.desgin;

public class Singleton {
	
	public static  Singleton singleton=null;
	
	
	private Singleton() {
	}
	
	public static Singleton getIntance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return  singleton;
	}

}

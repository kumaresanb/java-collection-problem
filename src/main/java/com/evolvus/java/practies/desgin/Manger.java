package com.evolvus.java.practies.desgin;

public class Manger {
	
	public static void main(String[] args) {
		Singleton a=Singleton.getIntance();
		Singleton b=Singleton.getIntance();
		Singleton c=Singleton.getIntance();
		System.out.println("A Reference:"+a.hashCode());
		System.out.println("b Reference:"+b.hashCode());
		System.out.println("c Reference:"+c.hashCode());


	}

}

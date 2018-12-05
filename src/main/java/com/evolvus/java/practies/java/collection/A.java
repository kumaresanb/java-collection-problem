package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class A implements Comparable {
	
	boolean flag;
	int i;
	public A(boolean flag,int i) {
		this.flag=flag;
		this.i=i;
	}
	
	public int compareTo(Object obj) {
		A a=(A)obj;
		return new Boolean(flag).compareTo(a.flag);
	}
	
	@Override
	public String toString() {
		return "(i= "+i+",flag="+flag+")";
	}
	
	public static void main(String[] args) {
		A a1=new A(true,10);
		A a2=new A(false,1);
		A a3=new A(true,2);
		A a4=new A(false,100);
		A[] all= {a1,a2,a3,a4};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}

}

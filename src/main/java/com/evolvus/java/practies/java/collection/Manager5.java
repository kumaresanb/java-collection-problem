package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class Manager5 {
	
	public static void main(String args[]) {
		class A{
			int i;
			public A(int i) {
				this.i=i;
			}
		}
		
		A all[]=new A[4];
		all[0]=new A(90);
		all[1]=new A(20);
		all[2]=new A(40);
		all[3]=new A(60);
		Arrays.sort(all);
		for (A a : all) {
			System.out.println(a.i);
		}
	}

}

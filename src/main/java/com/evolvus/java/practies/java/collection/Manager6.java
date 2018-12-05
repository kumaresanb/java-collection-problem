package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class Manager6 {
	public static void main(String args[]) {
		class B implements Comparable {
			 int i;
			 public B(int i) {
				 this.i=i;
			}

			public int compareTo(Object o) {
				B a=(B)o;
				return this.i-a.i;
			}			
		}
		
		B all[]= new B[4];
		all[0]=new B(20);
		all[1]=new B(30);
		all[2]=new B(50);
		all[3]=new B(10);
		Arrays.sort(all);
	   	
		for (B b : all) {
			System.out.println(b.i);
		}
	}
}

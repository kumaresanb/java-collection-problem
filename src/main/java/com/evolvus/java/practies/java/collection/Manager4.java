package com.evolvus.java.practies.java.collection;

import java.util.Arrays;

public class Manager4 {
		public static void main(String args[]) {
			String str1[]= {"abc","Abc","ABC","aBc","abC","123","345"};
			System.out.println(Arrays.toString(str1));
			Arrays.sort(str1);
			System.out.println(Arrays.toString(str1));
		}
}

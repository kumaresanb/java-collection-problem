package com.evolvus.java.practies.java.hashset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class M {
	int i;

	M(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}

	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return i == ((M) obj).i;
	}
}

class SortBasedOnI implements Comparator{

	public int compare(Object o1, Object o2) {
		return ((M)o1).i-((M)o2).i;
	}
	
}
public class Manager6 {

	public static void main(String[] args) {
         HashSet hashSet=new HashSet();
         hashSet.add(new M(90));
         hashSet.add(new M(20));
         hashSet.add(new M(30));
         hashSet.add(new M(10));
         hashSet.add(new M(40));
         hashSet.add(new M(50));
         hashSet.add(new M(60));
         hashSet.add(new M(60));
         System.out.println(hashSet);
         
         TreeSet treeSet =new TreeSet(new SortBasedOnI());
         treeSet.addAll(hashSet);
         System.out.println(treeSet);
         
	}

}

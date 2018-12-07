package com.evolvus.java.practies.java.mapstream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager3 {
	
	public static void main(String[] args) {
		HashMap hashMap=new HashMap();
		hashMap.put("k1", 200);
		hashMap.put(1000, 20000);
		hashMap.put("t", "hello");
		Set set1=hashMap.keySet();
		System.out.println(set1);
		
		HashMap hashMap1=new HashMap();
		hashMap1.put("k1", 200);
		hashMap1.put(1000, 20000);
		hashMap1.put("t", "hello");
		Set set2=hashMap1.keySet();
		Iterator it=set2.iterator();
		Object key,element;
		while (it.hasNext()) {
			key=it.next();
			element=hashMap.get(key);
			System.out.println("Map Key::"+key);
			System.out.println("Map Elements::"+element);
			System.out.println("--------");
			
		}
		
	}

}

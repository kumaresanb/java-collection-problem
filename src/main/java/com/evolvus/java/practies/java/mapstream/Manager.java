package com.evolvus.java.practies.java.mapstream;

import java.util.HashMap;

public class Manager {
	public static void main(String[] args) {
			HashMap hashMap=new HashMap();
			hashMap.put("key1", "value1");
			hashMap.put("key2", "value2");
			hashMap.put("key3", "value3");
			hashMap.put("key4", "value4");
			hashMap.put("key5", "value5");
			System.out.println(hashMap.get("key4"));
			System.out.println(hashMap);
			HashMap hashMap1=new HashMap();
			hashMap1.put(100, "abc");
			hashMap1.put("xyz", 1000);
			System.out.println(hashMap1);
			HashMap hashMap2=new HashMap();
			hashMap2.put(null, "abc");
			hashMap2.put("xyz", null);
			System.out.println(hashMap2);
			/*Hashtable  hashtable=new Hashtable();
			hashtable.put(null, "abc");
			hashtable.put("xyz", null);
			System.out.println(hashtable);*/
	}
}

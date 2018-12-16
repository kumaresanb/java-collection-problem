package com.evolvus.java.practies.java.mapstream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortByValue1 {
	
	public static HashMap<String, Integer> sortByValue1(HashMap<String, Integer> hashMap){
		List<Map.Entry<String, Integer>> list=new LinkedList<Map.Entry<String,Integer>>(hashMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			};
			
		});
		
		HashMap<String, Integer> hashMap2=new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			hashMap2.put(entry.getKey(),entry.getValue());
		}
		return hashMap2;
	}
	
	public static void main(String[] args) {
		HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("java", 20);
		hashMap.put("sss", 10);
		hashMap.put("ram", 9);
		hashMap.put("ddd", 0);
		hashMap.put("ccc", 90);
		hashMap.put("eee", 60);
		hashMap.put("qqq", 70);
		hashMap.put("aaa", 80);
		
		Map<String, Integer> map=HashMapSortByValue1.sortByValue1(hashMap);
		for (Map.Entry<String, Integer> string : map.entrySet()) {
			System.out.println("Key="+string.getKey()+",Values="+string.getValue());
		}
	}

}

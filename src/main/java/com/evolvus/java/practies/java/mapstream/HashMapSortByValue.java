package com.evolvus.java.practies.java.mapstream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSortByValue {

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hmValue) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hmValue.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			};
		});
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			temp.put(entry.getKey(), entry.getValue());
		}

		return temp;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("Book", 90);
		hashMap.put("ram", 1);
		hashMap.put("java", 20);
		hashMap.put("spring", 9);
		Map<String, Integer> haMap=sortByValue(hashMap);
		for (Map.Entry<String, Integer> mapValue : haMap.entrySet()) {
			System.out.println("Key="+mapValue.getKey()+",Values="+mapValue.getValue());
		}
		
	}

}

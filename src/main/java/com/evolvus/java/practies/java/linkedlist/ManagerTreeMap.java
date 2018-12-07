package com.evolvus.java.practies.java.linkedlist;

import java.util.Map;
import java.util.TreeMap;

public class ManagerTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "v1");
		treeMap.put(1, "v2");
		treeMap.put(0, "v3");
		treeMap.put(90, "v4");
		treeMap.put(20, "v5");
		treeMap.put(50, "v6");
		treeMap.put(110, "v7");
		treeMap.put(40, "v8");
		System.out.println(treeMap);
		Map map1=treeMap.descendingMap();
		System.out.println(map1);
		Map map2=treeMap.headMap(30, true);
		System.out.println(map2);
	}

}

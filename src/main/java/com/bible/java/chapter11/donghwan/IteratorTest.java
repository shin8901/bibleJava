package com.bible.java.chapter11.donghwan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		List arr = new ArrayList<String>();
		arr.iterator();
		Map map = new HashMap<String, String>();
		map.put("1", "26");
		map.put("11", "23");
		map.put("133", "21");
		map.put("15", "21");
		System.out.println(map.getOrDefault("6", "Nothing"));
		System.out.println(map.putIfAbsent("7", "Not"));
		System.out.println(map.get("6"));
		System.out.println(map.get("7"));
//		Set set = map.keySet();
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
	}
}

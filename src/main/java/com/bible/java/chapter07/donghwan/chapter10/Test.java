package com.bible.java.chapter07.donghwan.chapter10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	void print() {
		System.out.println("Test 클래스임");
	}
	
	void add() {
		String str = "zz";
		List<String> a = new ArrayList<String>();
		List<String> b = new LinkedList<String>();
		a.add(str);
		b.add(str);
	}
	
}

package com.bible.java.chapter09.eunbi;

import java.util.StringJoiner;

public class ExStringJoiner {
	public static void main(String[] args) {
		String[] s = {"A", "B", "C"};
		StringJoiner st = new StringJoiner("','", "('", "')");

		System.out.println(st);
		
		for(String i : s) {
			st.add(i);
		}
		
		System.out.println(st);
		System.out.println(~1);
	}
}

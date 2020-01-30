package com.bible.java.chapter09.donghwan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		ImmutableA a = new ImmutableA();
		ImmutableB b = new ImmutableB();
		System.out.println(a.getString());
		System.out.println(b.getString());
		
		ImmutableA c = new ImmutableB();
		System.out.println(c.getString());
		Collections cc;
		ArrayList aa;
		LinkedList ll;
	}
}

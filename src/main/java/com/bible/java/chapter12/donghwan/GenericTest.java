package com.bible.java.chapter12.donghwan;

public class GenericTest {

	public static void main(String[] args) {
		call(new Person("dh","891125"));
		call(new Animal("891125"));
	}

	private static <T extends Animal> void call(T p) {
		System.out.println(p.toString());
	}
	
//	private static void call(T<? extends Animal> p) {
//		System.out.println(p.toString());
//	}	
	
}

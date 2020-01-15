package com.bible.java.chapter7.woonjae;

public class AnonymousClass {

	public static void main(String[] args) {

		Object dd = new Object() {
			public void method() {
				System.out.println("헐");
			}
			
			@Override
			public String toString() {
				method();
				return super.toString();
			}
		};
		System.out.println(dd);
	}
}

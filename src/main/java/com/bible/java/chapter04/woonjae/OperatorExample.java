package com.bible.java.chapter04.woonjae;

/**
 * <pre>
 * com.bible.java.chapter2
 * VariableExample.java
 *
 * 클래스 개요 : xxx를 처리하는 클래스
 * </pre>
 */
public class OperatorExample {

	public static void main(String[] args) {

		int i = 111;

		System.out.println(i);
		i = ~i;
		System.out.println(i);

		char a = 'a';
		System.out.println(a);
		System.out.println(~a);

		Object dd = null;

		System.out.println((Integer) getObj());

		// a = ~a; // 에러...

	}

	public static Object getObj() {

		return null;
	}

}

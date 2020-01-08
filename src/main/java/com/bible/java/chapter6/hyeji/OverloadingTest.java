package com.bible.java.chapter6.hyeji;

class OverLoading {
	void doTest() {
		System.out.println("doTest() 호출 1");
	}

	void doTest(int i) {
		System.out.println("doTest() 호출 2");
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.doTest();
		ol.doTest(2);
	}
}

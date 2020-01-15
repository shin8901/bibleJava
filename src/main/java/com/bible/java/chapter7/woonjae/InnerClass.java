package com.bible.java.chapter7.woonjae;

public class InnerClass {

	public static void main(String[] args) {
		InnerClassTest dd = new InnerClassTest();
		InnerClassTest.BInnerClass d = dd.new BInnerClass();

		InnerClassTest.SInnerClass s = new InnerClassTest.SInnerClass();

	}
}

class InnerClassTest {
	class BInnerClass {

	}

	static class SInnerClass {

	}

	void method() {
		BInnerClass dd = new BInnerClass();
	}

}

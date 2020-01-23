package com.bible.java.chapter07.woonjae;

public class InnerClass {

	public static void main(String[] args) {
		InnerClassTest dd = new InnerClassTest();
		InnerClassTest.BInnerClass d = dd.new BInnerClass();

		InnerClassTest.SInnerClass s = new InnerClassTest.SInnerClass();

	}
}

class InnerClassTest {
	{
		class InitClass {
		}

		InitClass dd = new InitClass();
	}

	class BInnerClass {

	}

	static class SInnerClass {

	}

	final class FInnerClass {

	}

	void method() {
		class InitClass {
		} // 위에꺼랑 다른 클래스가 됨

		BInnerClass dd = new BInnerClass();
	}

}

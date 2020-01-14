package com.bible.java.chapter7.eunbi;

public class test2 {
	public static void main(String[] args) {
		overriding oo = new overriding();
		test to = new overriding();
		
		//난 에러남 왜지..? 책 361p 부분에 내용 잇지만..이해가 안감..
		overriding ot = (overriding) new test();

		System.out.println(oo.T + oo.O);
		System.out.println(to.T );
		System.out.println(ot.T + ot.O);
	}

}

package com.bible.java.chapter07.eunbi;

public class overriding extends test {

	static int O = 1;

	public static void main(String[] args) {
		oTest("에이");

		T = 3;
		oTest(T);
	}
	
	public static String oTest(String a) {
		T = 3;
		oTest(T);
		return "A_"+a;
	}
	
	public String oTest() {
		T = 3;
		super.T = 2;
		oTest(T);
		super.oTest(T);
		
		return "A_";
	}
}

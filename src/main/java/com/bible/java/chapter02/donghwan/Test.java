package com.bible.java.chapter02.donghwan;

//전,후위형에서 주의할 점은 대입하여 바로 값을 가져다 쓸때이다.
public class Test {

	public static void main(String[] args) {
		int a = 1;
		a++;
		++a;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++); //주의!
	}
}

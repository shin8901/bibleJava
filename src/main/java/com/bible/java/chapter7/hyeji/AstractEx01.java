package com.bible.java.chapter7.hyeji;

abstract class Parent {
	Parent() {
		System.out.println("부모 생성자");
	}

	abstract void viewParent();
	/*
	 * AstractEx01.java:7: error: Child is not abstract and does not override
	 * abstract method viewParent() in Parent class Child extends Parent{ ^
	 */
}

class Child extends Parent {
	Child() {
		System.out.println("자식 생성자");
	}

	void viewParent() {
		System.out.println("부모 구현"); // 이거 써야 위에 오류가 안 뜬다
	}
}

public class AstractEx01 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}

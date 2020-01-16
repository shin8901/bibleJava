package com.bible.java.chapter7.hyeji;

public class Child2 extends Parent {
	public void viewChild1() {
		System.out.println("Child2 viewChild1()");
	}
	@Override
	public void viewParent2() {
		// TODO Auto-generated method stub
		super.viewParent2();
		System.out.println("Child2 viewParent2()");
	}
}

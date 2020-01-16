package com.bible.java.chapter7.hyeji;

public class Child extends Parent {
	public void viewChild1() {
		System.out.println("Child1 viewChild1()");
	}
	@Override
	public void viewParent2() {
		// TODO Auto-generated method stub
		super.viewParent2();
		System.out.println("Child1 viewParent2()");
	}
}
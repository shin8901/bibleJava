package com.bible.java.chapter7.hyeji;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// jdk 8 이전
		int x = 100; //8 이후 final 생략 가능
		class Inner {
			int y = 200;
			public void viewInner() {
				System.out.println(y);
				System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.viewInner();
	}
}


//200
//100
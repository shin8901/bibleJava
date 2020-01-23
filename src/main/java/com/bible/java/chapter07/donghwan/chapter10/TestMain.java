package com.bible.java.chapter07.donghwan.chapter10;


public class TestMain {

	public static void main(String[] args) {
		Test t = new Test() {
			public int num =10;
			public int getNum() {
				return this.num;
			}
			
			@Override
			void print() {
				System.out.println("익명클래스임");
			}
		};
		//t.getNum(); //밖에서 접근 못함 에러
		t.print(); // -> 부모 인스턴스를 바라보므로  안에서 만든 함수는 접근하지 못한다
	}

}

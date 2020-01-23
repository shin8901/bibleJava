package com.bible.java.chapter06.woonjae;

public class InitializeBlock {

	static {
		// 클래스 초기화 블럭
		System.out.println("1111111111111111");
	}

	{
		// 인스턴스 초기화 블럭
		System.out.println("22222222222222");
	}

	public static void main(String[] args) {
		// Constructor c = new Constructor();
		// 명시적으로 생성자가 존재하는경우 기본 생성자 없..
		
		System.out.println("생성전");
		InitializeBlock c = new InitializeBlock();

	}
}

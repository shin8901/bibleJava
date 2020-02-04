package com.bible.java.chapter12.donghwan;

public class Person extends Animal {
	
	String name;
	
	public Person(String name, String birthday){
		super(birthday); //명시하지않아도 컴파일러가 자동삽입 -> 상위클래스의 생성자를 통해 인스턴스 초기화
		//자식클래스에서 조상클래스의 멤버를 사용할 수도 있기 때문
		this.name = name;
	}
	
	void bite() {
		System.out.println("말해");
	}
}

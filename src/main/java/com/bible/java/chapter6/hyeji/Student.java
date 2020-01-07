package com.bible.java.chapter6.hyeji;

public class Student {

	//멤버변수 -> new 연산자를 통해 생김
	public int stdID;
	public String stdName;
	public String address;
	
	//생성자 구현
	//클래스이름과 동일, 매개변수 2개
	//생성자 오버로딩
	public Student(int id, String name) {
		stdID = id;
		stdName = name;
		address = "주소없음";
	}
	
	public Student(String name) {
		stdName = name;
	}
	
	//기본생성자
	public Student() {}
	
	public void showStudentInfo() {
		System.out.println(stdName + ", " + address);
	}
}

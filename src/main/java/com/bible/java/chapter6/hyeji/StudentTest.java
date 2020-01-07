package com.bible.java.chapter6.hyeji;

public class StudentTest {

	public static void main(String[] args) {

		//인스턴스 생성
		Student stdLee = new Student();
		stdLee.stdName = "이순신";
		stdLee.address = "서울";
		stdLee.showStudentInfo();
		
		//새로운 인스턴스 생성
		Student stdKim = new Student();
		stdKim.stdName = "김유신";
		stdKim.address = "경주";
		stdKim.showStudentInfo();
		
		//클래스 풀네임(패키지포함).클래스@주소값
		//주소값 -> heap영역에 존재하는 값
		//참조변수 출력
		System.out.println(stdLee);	
		System.out.println(stdKim);	
		
		//매개변수가 1개인 생성자
		Student stdPark = new Student("박명수");
		
		
		//매개변수가 2ㅐ인 생성자
		Student stdPark2 = new Student(20, "박명수");
		
		stdPark.showStudentInfo();
		stdPark2.showStudentInfo();

	}

}

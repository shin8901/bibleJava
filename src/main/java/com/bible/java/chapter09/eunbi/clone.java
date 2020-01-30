package com.bible.java.chapter09.eunbi;

import com.bible.java.chapter07.woonjae.Super;

public class clone {


	public static void main(String[] args) {
		Point o = new Point(1, 2);
		Point p = o.clone(); // 공변환타입 jdk1.5부터 추가된 기능 
		//오버라이딩 할때 조상 ㅅ메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는것.
	}
	
}

package com.bible.java.chapter1.donghwan;

public class Garbage {
	public static void main(String args[]) {
		String[] array = new String[3];
		
		
		array[0] = "0";// 상수 선언
		array[1] = "10";
		array[2] = "20";
		 
		// 이 순간 위에 선언했던 배열은 주소를 잃어버려 사라지게 된다
		// 주소를 잃어버려서 사용할 수 없는 메모리 -> Garbage
		array = new String[] {"하하", "호호", "히히", "후후", "헤헤"}; 
		 
		System.out.println(array[0]);

	}
}

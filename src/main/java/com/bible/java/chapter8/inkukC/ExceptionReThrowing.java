package com.bible.java.chapter8.inkukC;

//예외되던지기 예제
//양쪽 예외에서 실행이 필요한 경우 예외에서 예외를 발생시킴
public class ExceptionReThrowing {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 예외 처리");
		}
	}
	
	public static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 예외 처리");
			throw new Exception();
		}
		
	}
}

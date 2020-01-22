package com.bible.java.chapter8.inkukC;

public class ExceptionMethod {
	
	public static void main(String[] args) throws Exception {
//		try {
		method1();
//		} catch(Exception e) {
//			System.out.println("main에서 예외처리");
//		}
		
	}
	
	static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method1에서 예외처리");
		}
	}
	
	static void method2() throws Exception {
		//예외발생
		throw new Exception();
		
	}
}

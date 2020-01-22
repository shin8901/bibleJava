package com.bible.java.chapter8.inkukC;

import java.io.IOException;


public class ExceptionEx {
	public static void main(String[] args) {
//		System.out.println("예외 발생하는 경우");
//		System.out.println(1);
//		System.out.println(2);
//		try{
//			System.out.println(3);
//			System.out.println(1/0); // 예외발생
//			System.out.println(4);
//		} 
//		//Exception을 먼저 catch블럭을 하면 추가로 catch블럭 생성 불가
//		//catch(Exception e) {
//			
//		//} 
//		catch (ArithmeticException e) {
//			System.out.println(5);
//		} 
//		//멀티 catch
//		catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(999);
//		} 
//		
//		System.out.println(6);
//		System.out.println("-------------------------");
//		System.out.println("예외 미발생인 경우");
//		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(4);
//		} catch(Exception e) {
//			System.out.println(5);
//		}
//		System.out.println(6);
//		System.out.println("-------------------------");
		Exception e = new Exception("고의로 발생");
		RuntimeException e1 = new RuntimeException("고의로 발생");
		throw e1;
		
		
		
	}
	
	
}

package com.bible.java.chapter8.donghwan;

public class PException {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("일부러 만듦");
			throw e;
			//throw new Exception("일부러 만듦"); 한줄로 표현 가능
		}catch(Exception e) {
			System.out.println("에러 메세지 : "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}

package com.bible.java.chapter04.donghwan;

//java 1.7이후 버전부터  switch-case문에 문자열 비교가 가능함
public class SwitchString {

	public static void main(String[] args) {
		String[] vegetables = {"감자","당근","호박","고기"};
		String dd = "2222";
		String a = vegetables[0];
		switch(a) {
			case "감자":
				System.out.println("Potato");
				break; //break가 없다면 그냥 모두 실행됨, 필요에 따라 쓸것!
			case "당근":
				System.out.println("Carrot");
				break;
			case "호박":
				System.out.println("Pumpkin");
				break;		
				
			default:
				System.out.println("I like meat");
		}
	}
}

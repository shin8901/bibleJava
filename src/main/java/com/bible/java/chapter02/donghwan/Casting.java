package com.bible.java.chapter02.donghwan;

public class Casting {

	public static void main(String[] args) {
		byte b = 10;
		//int i = (int)b;
		int i = b;
		System.out.println(b);
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		//byte b2 = i2;
		System.out.println(i2);
		System.out.println(b2);
	}
}

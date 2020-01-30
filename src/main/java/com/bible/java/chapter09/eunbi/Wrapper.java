package com.bible.java.chapter09.eunbi;

import java.util.ArrayList;

public class Wrapper {


	public static void main(String[] args) {
		//래퍼클래스 Boolean, Character, Byte, Short, Integer, Long, Float, Double  가 있음
		Integer i = new Integer(100);		
		int i2 = new Integer(100);
		int i22 = new Integer(200);
		int i3 = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);	//오토박싱 new Integer(10);
		
		int v = list.get(0);	//언박싱
		
		
		System.out.println("i==i2    > "+ (i == i2));
		System.out.println("i-i22    > "+ (i - i22));
		System.out.println("i==i22   > "+ (i == i22));
		System.out.println("i2==i3   > "+ (i2 == i3));
		System.out.println("i==i3    > "+ (i == i3));
		
		
		System.out.println(Integer.BYTES); //
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE-1);
		System.out.println(Integer.MAX_VALUE+10);
		
	}
}

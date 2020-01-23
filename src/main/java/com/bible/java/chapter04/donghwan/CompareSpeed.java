package com.bible.java.chapter04.donghwan;

public class CompareSpeed {

	public static void main(String[] args) {
		int a = 2;
		int b;
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000000; i++) {
			
//			if(a == 2) {
//				b = 2;
//			}
//			else {
//				b = 0;
//			}
			b = a == 2 ? 3 : 0;
		}
		long end = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("끝 "+(end-start));
	}
}

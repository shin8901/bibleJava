package com.bible.java.chapter6.eunbi;

public class staticClass {

	int iv = 1;
	static int CV = 2;

	public static void main(String[] args) {
		staticClass s = new staticClass();
		System.out.println("main	staticClass		iv	" + s.iv);
		System.out.println("main	staticClass		CV	" + s.CV);		// 얘는 new 로 생성해도 이전에 변한값을 유지
		System.out.println("main	staticClass		CV	" + CV);
		
	}

	static void step3() {
		staticClass s = new staticClass();
		System.out.println("step4	staticClass		iv	" + s.iv);
		System.out.println("step4	staticClass		CV	" + s.CV);		// 얘는 new 로 생성해도 이전에 변한값을 유지
		System.out.println("step4	staticClass		CV	" + CV);
		
	}
	public void step1() {
		System.out.println("step1	staticClass		iv	" + iv);
		System.out.println("step1	staticClass		CV	" + CV);

	}
	public void step2() {
		System.out.println("step2	staticClass		iv	" + iv);
		System.out.println("step2	staticClass		CV	" + CV);
	}
}

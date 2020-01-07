package com.bible.java.chapter6.eunbi;

class Data {
	int x;
}

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		staticClass s = new staticClass();
		s.step1();
		System.out.println("----------------------------------------------------------------------------");
		s.iv++;
		s.CV++;		
		s.step2();
		System.out.println("----------------------------------------------------------------------------");
		s.main(null);
		System.out.println("----------------------------------------------------------------------------");
		staticClass.step3();
		
		
		
		
		defaultClass dc = new defaultClass();
		dc.age = 1;
		dc.color = "RED";

		defaultClass dc2 = new defaultClass(2, "PINK");
		
		System.out.println(dc.age + "__" +dc.color);
		System.out.println(dc2.age + "__" +dc2.color);
//		
//		staticClass.copy(d);
//		
//		Data d2 = copy(d);		
//		staticClass.copy(d2);
//		System.out.println(d.x);
//		System.out.println(d2.x);
	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp = d;
		tmp.x = 3;
		return tmp;
	}
}

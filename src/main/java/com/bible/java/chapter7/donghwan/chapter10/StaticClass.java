package com.bible.java.chapter7.donghwan.chapter10;

public class StaticClass { //이미 static클래스

	static class A {
		
	}
	
	class B {}
	static class C extends A{}
	
	//static class d extends B{} //불가능 B는 static클래스가 아니기 떄문에
	
	static class d extends StaticClass{}
	
	public class e extends StaticClass{}
}

package com.bible.java.chapter7.inkukC;

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		
	}
}

class InstanceManager {
	public static I getInstance() {
		return new B();
	}
}

class A {
	
	
	void methodA() {
		I i = InstanceManager.getInstance();
		i.mathodB();
		System.out.println(i.toString());
	}
}

interface I {
	//public abstract void play();
	public abstract void mathodB();
}

class B implements I {
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("play in B class");
//	}
	@Override
	public void mathodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB in B class");
	}
	
	public String toString() { 
		return "Class B";
	}
}




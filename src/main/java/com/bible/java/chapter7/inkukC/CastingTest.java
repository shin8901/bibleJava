package com.bible.java.chapter7.inkukC;

public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		//업케스팅
		car = fe;
		System.out.println(car instanceof FireEngine);
		//다운케스팅
		fe2 = (FireEngine)car;
		fe2.water();
		
		Car c = new Car();
		fe2 = null;
		//Car 참조변수의 인스턴스는 Car로 조상클래스 인스턴스인 경우 자식참조변수에 넣을 수 없다.
		//fe2 = (FireEngine)c;
		System.out.println(c instanceof FireEngine);
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

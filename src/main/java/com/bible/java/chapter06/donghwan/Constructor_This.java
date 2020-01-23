package com.bible.java.chapter06.donghwan;

class Car {
	String color;
	String gearType;
	int door;

	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car() {
		this("white","auto",4);
	}	
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}
public class Constructor_This {

	public static void main(String[] args) {
		// 
		Car c1 = new Car();
		Car c2 = new Car(c1); //주소값을 받아 값을 복사한다 -> 독립적인 인스턴스를 생성한다

	}

}

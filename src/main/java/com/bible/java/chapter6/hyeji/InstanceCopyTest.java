package com.bible.java.chapter6.hyeji;

class Car{
	int door;
	String color;
	String brand;
	
	//매개변수가 없을 경우
	Car(){
		door = 4;
		color = "white";
		brand = "BMW";
	}
	
	//매개변수가 있을 경우
	Car(int x, String y, String z){
		door = x;
		color = y;
		brand = z;
	}
	
	//객체를 넘겨받아 객체를 생성 
	//객체복사 : 똑같은 멤버변수를 갖는 객체가 하나더 생성
	Car(Car x){
		//door = x.door; color = x.color; brand = x.brand;  --> 이방식의 경우 c1객체의 값이랑 같음
		//this(); --> 매개변수가 없는 Car로 동작 (door = 4 ; color = "white"; brand = "BMW";)
		this(x.door, x.color, "현대"); // 매개변수가 있는 생성자를 호출
	}
}

public class InstanceCopyTest {

	public static void main(String[] args) {
		Car c1 = new Car(2, "black", "기아");
		Car c2 = new Car(c1);  //객체복사하는 메소드가 있으므로 사용가능
		System.out.println(c1.brand);  //기아
		System.out.println(c2.brand);  //현대
	}

}

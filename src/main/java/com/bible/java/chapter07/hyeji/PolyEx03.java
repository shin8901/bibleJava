package com.bible.java.chapter07.hyeji;

public class PolyEx03 {
	public static void main(String[] args) {
		Car car1 = new Car(1111, "red");
		Car car2 = new Car(1112, "yellow");
		Car car3 = new Car(1113, "green");
		
		//Car[] car = {car1,car2,car3};
		Object[] cars = {car1,car2,car3};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i].toString());
		}
	}
}
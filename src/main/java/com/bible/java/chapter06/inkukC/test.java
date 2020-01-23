package com.bible.java.chapter06.inkukC;

public class test {
	
	
	public static void main(String[] args)
	{
		Car c1 = new Car();
		//Car c2 = c1;
		Car c2 = new Car(c1);
		System.out.println(c1.color);
		System.out.println(c2.color);
		c1.color = "Black";
		System.out.println(c1.color);
		System.out.println(c2.color);
		
	}
}


class Car {
	String color;
	String gearType;
	int door;
	
	Car()
	{
		this.color = "White";
		this.gearType = "Auto";
		this.door = 4;
	}
	Car(Car c)
	{
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
}
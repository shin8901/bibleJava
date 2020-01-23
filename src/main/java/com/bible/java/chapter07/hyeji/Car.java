package com.bible.java.chapter07.hyeji;

public class Car {
	private int licenseNo;
	private String color;
	
	public Car(int licenseNo, String color) {
		this.licenseNo = licenseNo;
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car [license="+licenseNo+", color="+color+"]";
	}
}

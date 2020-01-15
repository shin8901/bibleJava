package com.bible.java.chapter7.donghwan;

public class Animal {
	String birthday;
	static final int IDX = 4;
	
	void bite() {
		System.out.println("짖어!");
	}
	
	Animal(String date){
		this.birthday = date; 
	}
}

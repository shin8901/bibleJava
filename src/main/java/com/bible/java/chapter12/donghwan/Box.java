package com.bible.java.chapter12.donghwan;

public class Box<T extends Fruit> {

	T item;
	
	
	void setItem(T item) {this.item = item;}
	T getItem() {return item;}
}

package com.bible.java.chapter09.eunbi;

public class Point implements Cloneable {
	int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point clone() {
		try {
			return (Point) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

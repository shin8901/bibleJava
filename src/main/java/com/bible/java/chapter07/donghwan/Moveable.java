package com.bible.java.chapter07.donghwan;

public interface Moveable {
	
	void move(int x, int y); //{} 포함되면 구현부가 있는걸로 간주하여 에러임
	
	void fly(int x, int y, int z);
}

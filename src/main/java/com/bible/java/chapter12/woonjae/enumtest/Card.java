package com.bible.java.chapter12.woonjae.enumtest;

public class Card {
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPACE = 3;

	static final int TWO = 0;
	static final int THREE = 1;
	static final int FOUR = 2;
//	final int kind;
//	final int num;

	public static void main(String[] args) {
		System.out.println(Card.CLOVER == Card.TWO);
		
		//System.out.println(CardEnum.Kind.CLOVER == CardEnum.Value.TWO);
	}

}

class CardEnum {
	enum Kind {
		CLOVER, HEART, DIAMOND, SPACE
	};

	enum Value {
		TWO, THREE, FOUR
	};

//	final Kind kind;
//	final Value value;

}
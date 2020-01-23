package com.bible.java.chapter07.donghwan;

public abstract class Abstact1 {
	abstract void play(int pos);
	abstract void stop();
}

class Audio extends Abstact1{

	@Override
	void play(int pos) {
		System.out.println();
	}

	@Override
	void stop() {
		System.out.println("오디오 꺼라");
		
	}
	
}
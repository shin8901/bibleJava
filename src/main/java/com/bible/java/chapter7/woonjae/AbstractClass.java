package com.bible.java.chapter7.woonjae;

import java.io.IOException;

public abstract class AbstractClass extends OverRide {

	abstract void methodB();
}

abstract class AbstractClass2 extends AbstractClass {

}

class NormalClass extends AbstractClass{

	@Override
	void methodB() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		super.methodA();
	}
	
} 
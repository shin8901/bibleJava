package com.bible.java.chapter7.woonjae;

import java.io.IOException;

public class Super extends OverRide {

	@Override
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		super.methodA();
	}
}

class SuperSuper extends Super {

	@Override
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		//super.super.methodA();
	}
}
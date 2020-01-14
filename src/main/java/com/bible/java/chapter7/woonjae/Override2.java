package com.bible.java.chapter7.woonjae;

import java.io.IOException;

public class Override2 extends OverRide {
	@Override
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		super.methodA();
	}

//	@Override
//	public void methodA() throws Exception {
//		// TODO Auto-generated method stub
//		super.methodA();
//	}

//	오류

	public static void main(String[] args) {
		Override2 dd= new Override2();
	}
}
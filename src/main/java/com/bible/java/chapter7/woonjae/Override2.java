package com.bible.java.chapter7.woonjae;

import java.io.IOException;

public class Override2 extends OverRide {
	@Override
	// 없어도 되는듯 , 권고사항?
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		super.methodA();
	}

	// @Override
	// 오버라이드 때만 명시가능
	public void methodB() throws IOException {
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
		Override2 dd = new Override2();
	}
}
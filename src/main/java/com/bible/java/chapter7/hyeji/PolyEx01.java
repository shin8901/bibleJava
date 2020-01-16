package com.bible.java.chapter7.hyeji;

public class PolyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.viewParent2();
		
		p = new Child2();
		p.viewParent2();
		
		// 강제 형변환
		Child2 c1 = (Child2)p;
		c1.viewParent1();
		c1.viewParent2();
	}

}



//Parent viewParent2()
//Child1 viewParent2()
//Parent viewParent2()
//Child2 viewParent2()
//Parent viewParent1()
//Parent viewParent2()
//Child2 viewParent2()

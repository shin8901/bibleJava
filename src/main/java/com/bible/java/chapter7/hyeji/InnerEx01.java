package com.bible.java.chapter7.hyeji;

public class InnerEx01 {
	private int x1 = 100;
	public int x2 = 100;
	
	class Inner{
		private int y1 = 200;
		public int y2 = 200;
		
		public void viewInner() {
			System.out.println("viewInner() 호출");
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(y1);
			System.out.println(y2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerEx01 inner = new InnerEx01();
		InnerEx01.Inner i = inner.new Inner();
		
		i.viewInner();
	}

}



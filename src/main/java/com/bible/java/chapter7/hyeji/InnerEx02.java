package com.bible.java.chapter7.hyeji;

public class InnerEx02 {
	private int x1 = 100;
	public int x2 = 100;
	
	static class Inner{
		private int y1 = 200;
		public int y2 = 200;
		
		public void viewInner() {
			System.out.println("viewInner() 호출");
			//System.out.println(x1);
			//System.out.println(x2);
			System.out.println(y1);
			System.out.println(y2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerEx02.Inner oi = new InnerEx02.Inner();
		
		oi.viewInner();
	}

}


//viewInner() 호출
//200
//200



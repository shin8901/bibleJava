package com.bible.java.chapter3.eunbi;

public class Operator {
	public static void main(String[] args) {
		
		int i = 5;
		print( i++ );
		print( ++i );
		
		print(3^5);  //  잘모르겠음
		
		i = 5;
		print2(i);
		print2(i<<2);
		print2(i>>2);
		
	}
	
	public static void print( int i ){
		System.out.println(i);
	}
	public static void print2( int i ){
		System.out.println(Integer.toBinaryString(i)+ "  "+ i);
	}
}

package com.bible.java.chapter02.inkukC;

public class StringEx {
	public static void main(String [] args)
	{
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		//string 연산은 한쪽이라도 string이면 string이 아닌것을 string으로 변환 후 연산을 함
		//덧셈같은 경우 위치가 중요.
		//숫자를 문자열로 변환할땐 ""를 더해주면 됨
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}

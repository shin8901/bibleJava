package com.bible.java.chapter2.donghwan;

public class Variable {
	public static void main(String[] args) {
		
		byte val = 127;
		//byte val = -129; 범위 에러
		System.out.println(val);
		
		
		//char  유니코드값을 알고 싶을 떄 이용
		//char 모든 데이터는 숫자로 저장 
		int code = 65;
		char c = (char)code;
		char cha = 'A'; //정수로 저장
		System.out.println(code);
		System.out.println(c);
		System.out.println(cha); //정수에 해당하는 문자를 찾아 출력
		
		//범위 알려줌!
		System.out.println(Integer.SIZE);
		
		//Long
		long vv = 2147483648L; //int보다 큰 범위일 경우 마지막에 L을 붙여줌, 그렇지 않으면 컴파일러가 int로 인식하고 에러를 낸다
		//long vv1 = 2147483648;
		//System.out.println(vv1);
		System.out.println(vv);
		
		//float,double
		float f = 0.1000000001f; //정밀도를 넘어섰다 f,F 모두 가능
		double d = 0.1000000001d; //d,D 모두 가능
		System.out.println(f);
		System.out.println(d);
		//정수형의 기본형은 int, 실수형의 기본형은 double
		//float rate = 1.618; //생략시 double로 간주되기 떄문에
		float rate = 1.618f;
		System.out.println(rate);
	}
}
//https://imasoftwareengineer.tistory.com/48

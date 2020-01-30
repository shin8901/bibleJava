package com.bible.java.chapter09.donghwan;

public class HashCodeTest {

	public static void main(String[] args) {
		Per a = new Per();
		//Per b = a;
		Per b = new Per();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a == b);
		
		//String은 문자열이 같다면 동일한 hashcode를 갖는다
		String aa = new String("aa");
		String bb = new String("aa");
		aa = bb;
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println(aa == bb);
		
	}
	
}

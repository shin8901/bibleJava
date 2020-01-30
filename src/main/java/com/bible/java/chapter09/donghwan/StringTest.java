package com.bible.java.chapter09.donghwan;

import java.util.StringJoiner;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC"+"D");
		String s3 = "ABCD";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2.intern() == s3);
		System.out.println(s1.intern() == "ABC");
		
		StringBuffer sb1 = new StringBuffer("aa");
		StringBuffer sb2 = new StringBuffer("aa");
		System.out.println(sb1 == sb2);
	}

}

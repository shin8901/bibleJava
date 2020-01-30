package com.bible.java.chapter09.woonjae;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		String a = "aaa";
		String b = "aaa";
		String c = "aaa";

		System.out.println(a == b);
		System.out.println(a == c);

		StringBuilder dd = new StringBuilder();
		pattern();
	}
	@Deprecated
	static void pattern() {

		String sp = "corna";
		Pattern p = Pattern.compile("c[a-z]*");
		if (p.matcher(sp).find()) {
			System.out.println("c로 시작");

			Matcher m = p.matcher(sp);
			if (m.matches()) {
				System.out.println("여기로 와야함");
			}
		}

		// 이상한거같아
		String sp2 = "111";
		Pattern p2 = Pattern.compile("(.)\\1\\1*");
		if (p2.matcher(sp2).find()) {
			System.out.println("동일한 문자를 3번이상 반복 할 수 없습니다.");
			Matcher m2 = p2.matcher(sp2);
			if (m2.matches()) {
				System.out.println("여기로 와야하는데 안와");
			}

		}

	}
}

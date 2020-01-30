package com.bible.java.chapter09.eunbi;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExString {

	public static void main(String[] args) {

		System.out.println(charactersRemove("우은비%검색%해*보쟈**"));

		String sp = "corna";
		Pattern p = Pattern.compile("c[a-z]*");
		if (p.matcher(sp).find()) {
			System.out.println("c로 시작");

			Matcher m = p.matcher(sp);
			if (m.matches()) {
				System.out.println("여기로 와야함");
			}
		}

		
		//이상한거같아
		String sp2 = "111";
		Pattern p2 = Pattern.compile("(.)\\1\\1*");
		if (p2.matcher(sp2).find()) {
			System.out.println("동일한 문자를 3번이상 반복 할 수 없습니다.");
			Matcher m2 = p.matcher(sp2);
			if (m2.matches()) {
				System.out.println("여기로 와야하는데 안와");
			}

		}

	}

	public static String charactersRemove(String s) {

		StringTokenizer st = new StringTokenizer(s, "*%");
		StringBuffer sb = new StringBuffer();
		// StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		return sb.toString();
	}

}

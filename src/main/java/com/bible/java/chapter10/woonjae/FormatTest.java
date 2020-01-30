package com.bible.java.chapter10.woonjae;

import java.text.ChoiceFormat;
import java.util.Arrays;

public class FormatTest {

	public static void main(String[] args) {
		test1();
	}

	static void test1() {

		int[] score = { 100, 20, 30, 70, 71, 69, 99 };
		String pattern = "60#D|70#C|80#B|90#A|100#S";
		ChoiceFormat c = new ChoiceFormat(pattern);

		for (int i = 0; i < score.length; i++) {

			System.out.println(c.format(score[i]));

		}
		Arrays.stream(score).forEach(System.out::println);
		Arrays.stream(score).forEach((value) -> {
			System.out.println(c.format(value));
		});
	}

}

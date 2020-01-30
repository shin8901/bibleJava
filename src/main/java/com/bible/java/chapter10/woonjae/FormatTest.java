package com.bible.java.chapter10.woonjae;

import java.text.ChoiceFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.function.IntConsumer;

import org.apache.commons.lang3.time.DateUtils;

public class FormatTest {

	public static void main(String[] args) {
		// Calendar d = new Calendar();
		// Calendar d = Calendar.getInstance();
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

	void test2() {

		// 2.Date -> Calendar
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
	}

	void test3() {

		// 2.Date -> Calendar
		Date now = new Date();
		Date yesterday = DateUtils.addDays(now, -1);
		Date tommorrow = DateUtils.addDays(now, 1);

		System.out.println(now);
		System.out.println(yesterday);
		System.out.println(tommorrow);
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
	}
}

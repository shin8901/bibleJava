package com.bible.java.chapter10.woonjae;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar d = new Calendar();
		// Calendar d = Calendar.getInstance();

	}

	static void test1() {

		// 1.Calenter -> Date
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
	}

	static void test2() {

		// 2.Date -> Calendar
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
	}

	static void test3() {

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

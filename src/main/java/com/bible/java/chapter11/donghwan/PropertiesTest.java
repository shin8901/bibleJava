package com.bible.java.chapter11.donghwan;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("dh", "genius");
		System.out.println(p.get("dh"));
		p.setProperty("dh", "best genius");
		System.out.println(p.get("dh"));
	}
}

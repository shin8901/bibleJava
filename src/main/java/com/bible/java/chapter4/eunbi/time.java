package com.bible.java.chapter4.eunbi;

import java.util.Date;

public class time {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		for(int i = 0 ; i < 1000000000 ; i++) {			
			
		}
		d = new Date();
		System.out.println(d.getTime());
		
		int i = 0;
		d = new Date();
		System.out.println(d.getTime());
		while(i < 1000000000) {
			i++;
		}
		 d = new Date();
		System.out.println(d.getTime());
	}
}

package com.bible.java.chapter6.eunbi;

import java.util.ArrayList;
import java.util.List;

public class variableness {

	public static void main(String[] args) {

		String[] strArr = new String[] {"1", "2", "3"};
		int[] intArr = new int[] {1, 2, 3};
		List<String> listArr = new ArrayList<String>();
		listArr.add("1");
		listArr.add("2");
		listArr.add("3");
		
		System.out.println(contcatenate(strArr));
		System.out.println(contcatenate2(strArr));
		System.out.println(contcatenate( new String[] {"1", "2", "3"}));
		System.out.println(contcatenate2( new String[] {"1", "2", "3"}));
	}
	
	//static String contcatenate(String ... arg, int ...iarg) {
	//static String contcatenate(String ... arg) {
	static String contcatenate(String[]  ... arg) {
		String result = "";
		for(String[] s : arg) {
	//	for(List<String>  s : arg) {
			result += "_" + s;
		}
		
		return result;
	}
	
	static String contcatenate2(String  ... arg) {
		String result = "";
		for(String s : arg) {
	//	for(List<String>  s : arg) {
			result += "_" + s;
		}
		
		return result;
	}
	
	
}

package com.bible.java.chapter6.eunbi;

public class variableness {

	public static void main(String[] args) {

		String[] strArr = new String[] {"1", "2", "3"};
		int[] intArr = new int[] {1, 2, 3};
		
		System.out.println(contcatenate(strArr));
		//System.out.println(contcatenate({"1", "2", "3"}));
	}
	
	//static String contcatenate(String ... arg, int ...iarg) {
	static String contcatenate(String ... arg) {
		String result = "";
		for(String s : arg) {
			result += "_" + s;
		}
		
		return result;
	}
	
}

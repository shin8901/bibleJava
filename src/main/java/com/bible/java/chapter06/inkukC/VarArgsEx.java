package com.bible.java.chapter06.inkukC;

public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		//System.out.println(concatenate("",  "100", "200", "300"));
		//배열도되는게 놀랍다
		System.out.println(concatenate("",  strArr));
		System.out.println(concatenate(strArr));
	}
	
	static String concatenate(String delim, String... args)
	{
		String result = "";
		
		for(String str : args) 
		{
			result += str + delim;
		}
		
		return result;
	}
	
	static String concatenate(String... args)
	{
		return concatenate("", args);
	}
}

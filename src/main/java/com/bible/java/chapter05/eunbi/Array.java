package com.bible.java.chapter05.eunbi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Array {
	public static void main(String[] args) {
		int[] a = {};
		int[] b = new int[10];
		b = a;
		System.out.println(Arrays.toString(b));   //[1, 2, 3, 4, 5]  
		int[] c = {1,2,3,4,5};
		int[] d = new int[10];
		for(int i = 0; i < c.length; i++) {
			d[i] = c[i];
		}
		
		Arrays.asList(new Object(),new Object(),new Object(),new Object(),new Object(),new Object(),new Object(),new Object(),new Object());
		System.out.println(Arrays.toString(d)); //[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

		int[] e = {1,2,3,4,5};
		int[] f = new int[10];
		
		System.arraycopy(e, 0, f, 1, e.length);
		
		
		a[2] = 7;
		c[2] = 7;
		e[2] = 7;
		System.out.println("A"+"_"+Arrays.toString(a));
		System.out.println("B"+"_"+Arrays.toString(b));
		System.out.println("C"+"_"+Arrays.toString(c));
		System.out.println("D"+"_"+Arrays.toString(d));
		System.out.println("E"+"_"+Arrays.toString(e));
		System.out.println("F"+"_"+Arrays.toString(f));
		
	}
}

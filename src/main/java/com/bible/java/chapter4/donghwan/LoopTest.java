package com.bible.java.chapter4.donghwan;

public class LoopTest {

	public static void main(String[] args) {
//		for (long i = 0; i < 10000000000L; i++) { //비교시 변환X
//			//System.out.println("1111");
//		}
//		System.out.println("aaaaaa");
//		for (int i = 0; i < 10000000000L; i++) { //비교시 변환이 발생하여 오래걸림 
//			//System.out.println("1111");
//		}
//		System.out.println("bbbb");
		
		int sum = 0;
		int i = 0;
		while((sum +=++i) <= 100) {
			System.out.println(i+ " - "+ sum);
		}
		
		System.out.println(i);
		do{
			System.out.println("한번 찍어!");
			i--;
		}
		while(i >0);
	}
}

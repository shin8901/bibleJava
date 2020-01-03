package com.bible.java.chapter4.sangyeol;

// 이름 붙은 반복문
public class Study {
	public static void main(String[] args) {
		// for문에 Loop라는 이름을 붙임
		Loop: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 4) {
					break Loop;
					//  break;
				}
				// continue Loop;
				// continue;
				System.out.println(i + "*" + j + "=" + i*j);
				// System.out.println("");
			}
			System.out.println();
		}

	}
}
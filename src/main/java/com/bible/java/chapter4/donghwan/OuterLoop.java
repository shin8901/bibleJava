package com.bible.java.chapter4.donghwan;

public class OuterLoop {

	public static void main(String[] args) {
		Loop1: for(int i=2; i<=9;i++) {
			for(int j=3; j<=9; j++) {
				for(int k=4; k<=9; k++) {
					System.out.println(i + " "+j+ " "+ k);
					if(k == 6) continue Loop1;
					if(j == 5) break Loop1;
				}
			}
			System.out.println("first Loop");
		}
	}
}

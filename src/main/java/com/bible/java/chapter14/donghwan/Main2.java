package com.bible.java.chapter14.donghwan;

public class Main2 {

	public static void main(String[] args) {
		//for break 대신 사용!
		boolean setYn = treeDvo.stream().anyMatch(x -> x.getLvl().compareTo(new BigDecimal(1)) == 0);
	}
}

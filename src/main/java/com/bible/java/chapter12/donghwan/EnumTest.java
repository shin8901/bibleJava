package com.bible.java.chapter12.donghwan;

public class EnumTest {

	public static void main(String[] args) {
		int grade = 1;
		switch (grade) {
		case 0:
			System.out.println(Constants.VIP);
			break;
		case 1:
			System.out.println(Constants.GOLD);
			break;
		case 2:
			System.out.println(Constants.SILVER);
			break;
		case 3:
			System.out.println(Constants.BRONZE);
			break;
		} 
		
		
		Grade g = Grade.BRONZE;
		Grade g2 = Grade.valueOf("BRONZE"); //DB에서 뺴온 값이라 생각...
		
		System.out.println(g2);
		
		System.out.println(g2.getName()); //상수 매핑시키기
		//멀티타입 매핑
		System.out.println("어떻게 갈까요?? "+ g2.getTransfer());
		
	}
}

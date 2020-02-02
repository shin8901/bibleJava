package com.bible.java.chapter12.donghwan;

public enum Grade {
	VIP("10만원상품권","항공권 지원"),GOLD("5만원상품권","기차 지원"),SILVER("3만원상품권","대중교통 지원"),BRONZE("1만원상품권","걸어오셈");
	
	final private String name;
	final private String transfer;
	
	private Grade(String name, String transfer) {
		this.name = name;
		this.transfer = transfer;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTransfer() {
		return transfer;
	}
}

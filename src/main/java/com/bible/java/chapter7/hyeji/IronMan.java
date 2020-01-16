package com.bible.java.chapter7.hyeji;

public class IronMan implements Heroable {
	int weaponDamage = 100;

	public int fire() {
		System.out.printf("빔 발사 : %d만큼의 데이지를 가함%n");
		return this.weaponDamage;
	}

	public void changeShape(boolean isHeroMode) {
		if (isHeroMode) {
			System.out.println("장갑 장착");
		} else {
			System.out.println("장갑 제거");
		}
	}

	public void upgrade() {
		int before = weaponDamage;
		weaponDamage += weaponDamage * 0.1;
		System.out.printf("무기 성능 개선 : %d --> %d%n", before, weaponDamage);
	}
}
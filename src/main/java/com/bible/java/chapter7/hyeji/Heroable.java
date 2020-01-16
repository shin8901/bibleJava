package com.bible.java.chapter7.hyeji;

interface Fightable {
	int fire();
}

interface Transformable {
	void changeShape(boolean isHeroMode);
}

public interface Heroable extends Fightable, Transformable {
	void upgrade();
}
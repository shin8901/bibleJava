package com.bible.java.chapter12.woonjae.enumtest;

public class Card
{
    static final int CLOVER = 1;
    static final int HEART = 2;
    static final int DIAMOND = 3;
    static final int SPACE = 4;

    final private int kind;
    final private int num;
    
}

class CardEnum {
    enum Kind {        CLOVER,HEART,DIAMOND,SPACE} ;
    
    enum Value {
        TWO,THREE,FOUR
    };

    final Kind kind;
    final Value value;

}
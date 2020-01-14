package com.bible.java.chapter7.eunbi.abstractTest;

class Main {

    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
        

    }
}
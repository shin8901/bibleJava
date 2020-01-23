package com.bible.java.chapter07.hyeji;


// 인터페이스 멤버 변수와 메서드 구현 => 인터페이스를 implement하고 메서드를 재정의해야 한다.

interface InterA {
  // 상수와 추상 메서드
  public static final String str1 = "홍길동";
  public abstract void methodA();
}
class Parent {

}
// 편법적 다중 상속
class InterImpl extends Parent implements InterA {
  /*
  InterEx01.java:11: error: InterImpl is not abstract and does not override abstra
  ct method methodA() in InterA
  class InterImpl extends Parent implements InterA {
  ^
  */
  public void methodA() {
    // 이렇게 하면 에러가 안 난다 -> 재정의해야 한다
  }
}
public class InterEx01 {
  public static void main(String[] args) {
    //InterA a = new InterA();
    /*
    InterEx01.java:11: error: InterA is abstract; cannot be instantiated
    InterA a = new InterA();
               ^
    */
    InterImpl i = new InterImpl();
  }
}
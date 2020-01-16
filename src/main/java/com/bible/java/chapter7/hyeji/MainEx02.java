package com.bible.java.chapter7.hyeji;

//상속 부모, 자손, 손자 클래스
class Parent {
	  String p = "부모자료";
	  Parent() {
	    System.out.println("Parent() 생성자 호출" + this);
	  }
	  void viewParent() {
	    System.out.println("viewParent() 호출");
	  }
	}

	class Child extends Parent{
	  String c = "자식자료";
	  Child() {
	      System.out.println("Child() 생성자 호출" + this);
	  }
	  void viewChild() {
	    System.out.println("viewChild() 호출");
	  }
	}
	class GrandChild extends Child{
	  String gc = "손자자료";
	  GrandChild() {
	      System.out.println("GrandChild() 생성자 호출" + this);
	  }
	  void viewGrandChild() {
	    System.out.println("viewGrandChild() 호출");
	  }
	}

	public class MainEx02 {
	  public static void main(String[] args) {
	    Parent p = new Parent();

	    Child c = new Child();

	    GrandChild gc = new GrandChild(); // 상속이 누적된다
	    gc.viewChild();
	    gc.viewParent();
	  }
	}
	
	
// 주소 확인
//손자 객체가 생성됐을 때 호출된 생성자를 보면, 부모, 자식, 손자 생성자의 참조값이 모두 같다.
//손자 객체가 부모와 조부모의 클래스까지 모두 포함해있다는 걸 알 수 있다.
	
	
	
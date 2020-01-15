# item4 용어정리

**접근제어자 (access modifier)**  
private -- 현 클래스 내에서만  
default -- 현 패키지 내에서만   
protected -- 현 패키지 내에서만 && 상속을 받은경우 외부패키지에서도  
public -- 모두가능  

예제 : package item4.accessa , item4.accessb


**추상클래스 (Abstract Class)**

-하나이상의 abstract 메소드 -> must be 'abstract Class'  
-명시적으로 abstract Class  

--> OOP 3특징 (캡슐화,상속,다형성) 중 상속과 가장 연관  

** 계층구조상 아래로 구체화 하는 과정 혹은 위로 추상화 하는 과정 고려가능한 레이어 
<pre>
			생 물 --------------> 해당 레이어의 타입을 인스턴스화 할 필요가 있는가.  
			  |  
		동 물   식 물 ---------> 해당 레이어의 타입을 인스턴스화 할 필요가 있는가.  
		  |       |  
	포 유   파 충...	  	
	  |  
인간 사자 ...........  
</pre> 

abstract vs interface 

	public abstract class AbstractClass {
	
		int a;
	
		static int b;
	
		abstract void methodTest(); // extends 하는 하위 클래스에 이 메소드의 overide를 강제
									// 하나이상의 abstract 메소드를 가지고 있다면, abstract Class가 되어야한다
									// 혹은 abstract 메소드가 없어도 명시적으로 abstract Class를 지정할수있다.
		
		static void methodTest2() {
			//System.out.println(a);
			System.out.println(b);
		};
		
		void methodTest3() {
			System.out.println(a);
			System.out.println(b);
		};
	
	}
	
	public interface InterFaceExam {
		int a = 0; // It's Final field 상수야 상수
	
		void methodTest();
	
		static void methodTest2() {
			System.out.println(a);
		};
	
		default void methodTest3() {
			System.out.println(a);
		};
	}

공통점 
	- 인스턴스화 불가
	- 추상화 방법론의 일환
	- 추상메소드를 가질 수 있으며, 이를 하위 클래스에서 구현강제 가능.
	- 메소드를 구현 할 수 있음. ( java 8 부터 interface에서 default 예약어로)
	- static 메소드를 가질 수 있음 (구현도 가능).
	
	
차이점
	
* 추상클래스(abstract class)
	- 인스턴스 멤버를 가질수있음.
	- extends 단일상속
	
* 인터페이스 (interface)
	- 변수선언시 final static (클래스 멤버)
	- implement 다중 계층구조
		
		
**PS. abstract class 여야 할까? interface 여야 할까?**

https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html 

Which should you use, abstract classes or interfaces?  
Consider using abstract classes if any of these statements apply to your situation:  

You want to share code among several closely related classes.  
존내 연관높은 클래스 사이에서 코드를 공유하고 싶을때
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).

특정 abstract class 상속받게 될 클래스들의 겹치는  메소드나 필드들이 많을때,
접근제어자가 public 이외의 다른것들이 요구 될 때(such as protected and private).
-> 인터페이스에서는 안되니까

You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.

non-static 하고 non-final fields를 선언하고,
이런 필드들을 접근해서 수정하고, 상태를 바꿀수있는 메소드를 정의하고싶을때


Consider using interfaces if any of these statements apply to your situation:  

You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.

연관되어있지 않은 클래스들을 한 계층구조로 묶고싶을때,
Comparable, Cloneable 같은경우 연관없이 설계되었을 여타 다른 클래스들에 implements 되어있음.

You want to specify the behavior of a particular data type, but not concerned about who implements its behavior. 

누가 구현할지 는 상관없이, 클래스의 행동을 특정하고 싶을 때 

You want to take advantage of multiple inheritance of type.
  
다중계층구조의 이점을 누리고싶을 때



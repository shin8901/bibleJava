#chaper7 객체지향 2


**1 . 상속**
1.1 기본
>> 계층구조
>> 계층별 추상화 혹 구체화
	
>> 책 - 기존의 클래스를 재사용하여, 새로운 클래스를 작성하는것.
	
>> 자바에서 extends 예약어 사용
>> 조상클래스 - 부모,상위,기반 클래스
>> 자손클래스 - 자식,하위,파생클래스
	
>> 다이어그램으로 이해하면 편해요
	
>> 생성자와 초기화 블럭은 상속 x, 멤버만 상속된다.
>> 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
	
	** [접근제어자를 통해 private, default인 경우는 안된다기보다, 접근이 제한되는것.] **
		
>> **전체클래스들을 면밀히 분석해서, 상속관계를 맺어  재사용성을 높여주는것**
>> 객체지향에서 가장 중요한 부분
	

 1.2 클래스간 관계 - 포함관계 (컴포지션) , is-a has-a

```java	
	class A {
		B b;
	}
```
	
>> is a (상속) vs has a (컴포지션 : 포함관계)
	
	
	
** 다중상속 **

>> 자바에서는 단일상속만 허용함.
>> 다중상속 : 여러 클래스들을 상속함. C 가능
>> 만약 허용된다면, extends A,B,C .......... ?
	
> A 클래스에 test()
> B 클래스에 test()
	
```java
	class Test extends A,B
		
	main(){
		
		Test t= new Test();
		t.test(); //from A ? .. B ? 
		// 뻐큐 맨	
	}
```

	
>> 단일상속 이 다중상속에 비해 가지는 특장점.

>> **클래스 간 관계가 명확해지고, 코드를 더욱 신뢰할 수 있다는 점에서 유리.**

1.3 Object 클래스 ** 뭔데 넌 맨위에 있냐
*** 다형성가서 봅시다 ***

1.4 오버라이딩 - 수퍼가 가지는 메소드, 재정의

조건 1 ** 조상클래스보다 좁은 범위로 접근제어자를 재정의할수없음
public -> 무줘권 public
protected -> public, protected
...

조건 2 ** 조상 클래스의 메서드보다, 많은 수의 예외를 선언할 수 없음.

>> a throws Aexception, Bexception

>> (override a) a` throws AException

>> **OK**

>> a throws Aexception, Bexception

>> (override a) a` throws BException

>> **OK**

>> a throws Aexception, Bexception

>> (override a) a` throws AException, BException, CException
	
>> **NOPE**

>> a throws Aexception, Bexception

>> (override a) a` throws Exception
	
>> **NOPE**


>> **정리**
>> 접근제어자는 좁지않게, 예외처리 같거나 더 좁게
>> 인스턴스 메소드는 스태틱이 아니게.
ㅓ	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
2 . 캡슐화
	- 
	- 

3 . 다형성 - 하나의 호출에 다르게 반응하는 형질

	
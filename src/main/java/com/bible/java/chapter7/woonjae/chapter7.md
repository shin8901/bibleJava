#chaper7 객체지향 2

캡슐화,상속,다형성

캡슐화 	-> 가릴꺼 가리고, 인터페이스만 오픈
		-> 정보보호 효과, 모듈간 결합도 줄일 수 있음
		
상속 		-> 계층구조 형성
		-> 다형성 형질에 구조가됨.
		-> 수퍼를 재사용 할 수 있다.
		-> 특정 클래스들을 묶어 추상화 시켜서 계층구조로 묶는다거나
		-> 클래스를 설계 할 때 계층구조로 설계하여, 재사용성을 높일 수 있음.

다형성	-> 여러형태를 가질수 있는 형질
		-> 하나의 메세지에 서로다르게 동작하는 형질
		-> 부모 타입 변수에 , 자식 타입 인스턴스를 사용
		-> 왜 이렇게 할까
		
List a = new ArrayList
-> List a = new LinkedList


불필요한 하위 클래스에 메소드 접근을 막음.
시스템 표준을 유도함.

-> ArrayList를 다른 List로 바꿔도, 컴파일에러는 나지않음.

ArrayList
	a.add();
LinkedList
	a.add();
	
같은 메소드로 호출되지만, 서로 다르게 반응함. 구현내부가 다름. -> 다형성


		

------------------------------------------------------------


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

1.3 Object 클래스 

** 뭔데 넌 맨위에 있냐**

** 다형성가서 봅시다 **

------------------------------------------------------------
**2 . 오버라이딩** 
- 수퍼가 가지는 메소드, 재정의

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
	
2.4 super 
>> 조상클래스의 접근예약어
>> 현재 인스턴스의 것들과 차이를 둘때 사용

```java
	@Override
	public void methodA() throws IOException {
		// TODO Auto-generated method stub
		super.methodA();
	}
```

[super.super는 왜안될까](https://hashcode.co.kr/questions/503/%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C-%EC%99%9C-supersupermethod%EB%8A%94-%EC%95%88%EB%90%98%EB%8A%94%EA%B1%B0%EC%A3%A0 "super") 

[같은내용_stackoverflow](https://stackoverflow.com/questions/586363/why-is-super-super-method-not-allowed-in-java,"stackoverflow")


------------------------------------------------------------

**3. 패키지...? 임포트..?**

**package 는 계층구조로 구조화 시킬수있고, 실제로는 디렉토리다.**
**클래스는 하나의 패키지에만 속해야하고 다른패키지의 동일 클래스명을 가지면 다른 클래스다**

import는 패키지 명없이 클래스를 사용할 수 있게 도와준다.
static import -> chapter2 woonjae.StaticExample


package
import
class 선언

------------------------------------------------------------

** 4 제어자들 **

final
static
abstract

접근제어자들 - private,(default , private-package),protected,public

접근제어자로의 캡슐화
  
------------------------------------------------------------
  

** 5 다형성 **
여러가지 형태를 가질수 있는 능력
부모 타입 **변수** = 자식 타입 **인스턴스**

Object 클래스를 상속하여 상속관계를 유지하고,
Object라는 클래스에 기본적으로 제공해야할 메소드들을 제공하여 시스템 표준을 제공한다.

Object dd = new AnyObject;

캬 지렸다.


형변환
자식 -> 조상 (업-캐스팅) 캐스팅 없어도 댐
조상 -> 자식 (다운-캐스팅) 캐스팅 생략 불가

**5.5 매개변수의 다형성**

5.5 예제 보자

하는일이 같아버리고, 몬가 중복코드.. 끙 불편
 

```java
void buy(Computer c)
void buy(Audio a)

fuck you man

void buy(Product p)

```

Vector 꺼져

ArrayList vs Vector 차이

------------------------------------------------------------

**6.추상클래스**

abstract class A

추상클래스 자체적으로 해당 타입으로 인스턴스를 생성 할 수 는 없음.
Anonymous 클래스로 만들수는 있는데 
클래스를 선언하고 바로 그 선언된 클래스를 인스턴스로 만드는것.

abstract method를 포함하면 반드시 abstract class 여야함.

하위 클래스들에게 구현을 강제함.

피하려면 ? 상속받는 클래스도 abstract class

------------------------------------------------------------

**7. interface **

추상화 관련 같은 컨셉인 abstract와 비슷한 역할을 함.

abstract class보다 추상화 레벨이 높다.
다중 계층구조 , implements
인터페이스 끼리는 extends .. 
>>> 참고 : 인터페이스는 ~able 등의 이름으로 제공되어지는 경우가 많음

>>> 명확하게 무엇이다 라는 개념보다, ~을 할수있다 .

>>> '~을 할수 있는 기능'을 포함했다 정도의 의미로 제공되는 경우가 많다.


> 시스템 표준화

> 음 대충 이런게 있으면 좋겟고, 이런거, 이런게 있어야겠네

> 하위 클래스들은 이런 정보를 표준으로 클래스를 만들수 있도록 표준제공(강제).

> 이런것들은 당연히도 abstract class로도 가능

> 그렇다면 생각해봐야할것

> ** abstract class ** vs ** interface **

> 비슷한 추상화 레벨을 구성할 수 있는 두가지 키워드 상에서

> 클래스 간 규약, 시스템 표준 등의 기본을 제공하는데는 인터페이스
> 



	
**2 . 캡슐화**

	- 
	- 

3 . 다형성 - 하나의 호출에 다르게 반응하는 형질
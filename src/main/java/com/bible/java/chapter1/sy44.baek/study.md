# 자바
**1. 운영체제에 독립적이다.**
 <br> - 운영체제나 하드웨어가 아닌 자바가상머신(JVM)을 통해서 통신, 전달하여 각 운영체제가 이해할 수 있도록 변환

**2. 객체지향언어이다.**
 <br> - 상속, 캡슐화, 다형성

**3. 배우기 쉽다.**
 <br> - 연산자와 기본구문: 기본구문 C++
 <br> - 객체지향구문: 스몰톡(small talk)

**4. 자동 메모리 관리 (Garbage Collection)**
 <br> - Garbage Collection: 자동 메모리 관리

**5. 네트워크와 분산처리를 지원한다.**
 <br> - 다양한 네트워크 프로그래밍 라이브러리(Java API)를 통해 쉽게 개발 가능

**6. 멀티쓰레드를 지원한다.**
 <br> - 다른언어에서는 운영체제에 따른 멀티쓰레드 구현방법이 다르지만, 자바는 시스템과 관계없이 구현 가능
 <br> - 인터프리터: 여러 쓰레드에 대한 스케줄링(scheduling) 처리

**7. 동적로딩(Dynamic Loading)을 지원한다.**
 <br> - 자바는 동적로딩을 지원하기 때문에 필요한 시점에 클래스를 로딩하여 사용
 <br> - 일부 클래스가 변경되어도 전체 어플리케이션을 다시 컴파일하지 않아도 된다.
 <br>  
# JVM(Java Virtual Machine)
**1. 자바를 실행하기 위한 가상 기계**  
**2. Java 어플리케이션은 JVM과 상호작용하기에 OS와 하드웨어에 독립적이지만, JVM은 OS에 종속적이기에 해당 OS에서 실행가능한 JVM이 필요하다.**  
**3. 하드웨어에 맞게 완전히 컴파일된 상태가 아니고 실행 시 해석(interpret)되기 때문에 속도가 느리다는 단점이 있지만, JIT컴파일러와 최적화 기술의 적용으로 속도 격차를 줄이고 있다.**
<br> - JIT컴파일러: 바이트코드(컴파일된 자바코드)를 하드웨어의 기계로 바로 변환  
**4. 'Write once, run anywhere' (한 번 작성하면 어디서든 실행된다.)**
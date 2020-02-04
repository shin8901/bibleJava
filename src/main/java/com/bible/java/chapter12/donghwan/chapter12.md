#chapter 12 연습문제 https://developer-ek.tistory.com/18

#제네릭스
 - 정의 => 클래스 내부에서 사용할 데이터 타입을 나중에 인스턴스를 생성할 때 확정하는 것을 제네릭이라 한다
 - 타입을 제한할 수 있다(컴파일시 에러)
 - 형변환을 줄일 수 있다
 - 인터페이스도 가능하다. extends를 써야한다
 - 제네릭 타입을 부모 클래스로 사용할 경우 -> 타입 파라미터는 자식 클래스에도 기술해야 한다(추가도 가능)
   (public class ChildProduct<T,M,C> extends Product<T,M> { ... })
   

#자바 책처럼 볼수 있는 사이트
http://tcpschool.com/java/intro

#Generic 궁금증요
https://www.slipp.net/questions/202

#Enum
  - 1.5이후부터 지원
  - 클래스처럼 보이게 하는 상수
  - 클래스 안,밖 선언 가능
  - 마지막 끝에 세미콜론 붙이지 않는다.
  - enum은 다른 추상 메소드가 아닌 일반 메소드를 가질 수 있다
  - 열거된 순서에 따라 0부터 순서를 가짐(ordinal함수)
  - 열거형 상수를 다른값과 연결하기(EnumTest.java 참고) -> 이떄는 세미콜론 필요
  - 상수값이 바뀌어도 참조하는 다른파일은 다시 컴파일하지 않아도 된다
  - 열거형 상수 간의 비교에는 ==을 사용할 수 있다. equals()가 아닌 ==으로 비교가능한 것은 그만큼 빠르다는 것이다.
  - 하지만 비교연산자(<, >)는 사용할 수 없고 compareTo()는 사용 가능하다. 
  - https://ryan-han.com/post/java/java-enums/ -> Enum 설명 
  - https://doublesprogramming.tistory.com/192 -> 멀티타입 설명
  - http://rangken.github.io/blog/2015/effective-java-5/ -> Enum 심화사용
  - https://m.blog.naver.com/PostView.nhn?blogId=whomi201&logNo=221207632747&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F -> 상수변경시 재컴파일
  - http://www.nextree.co.kr/p11686/
  
#Annotation
  - 주석처럼 프로그램에 영향을 주지 않으면서 다른 프로그램이나 플러그인에게 유용한 정보를 제공 

 




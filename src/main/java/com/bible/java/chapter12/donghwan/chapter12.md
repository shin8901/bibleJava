#chapter 12 연습문제 https://developer-ek.tistory.com/18

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

 




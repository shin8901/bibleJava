#Collection FrameWork

#Iterator

# reflection (어려움...)
- https://gyrfalcon.tistory.com/entry/Java-Reflection
- https://m.blog.naver.com/PostView.nhn?blogId=gracefulife&logNo=220627537434&proxyReferer=https%3A%2F%2Fwww.google.com%2F

#String VS StringBuffer VS StringBuilder
- String 클래스는 불변 클래스이기 때문에 String을 더하는 경우 gc가 호출되기 전까지 String의 주소값이 stack에 쌓이게 된다
- https://novemberde.github.io/2017/04/15/String_0.html
- StringBuffer는 멀티쓰레드환경에서 안전, StringBuilder는 동기화지원 X -> 속도는 조금더 빠름

#String 클래스가 불변클래스인 이유?
- String 클래스는 문자열 연산이 적고 조회가 많을 때 멀티쓰레드 환경에서 사용하면 좋음. -> 진짜 이유는 클래스를 변수로 가질떄 그 변수가 불변타입이 아니면 변경가능하기 때문임!
- 방어적 복사본 -> 객체를 변경하려고 할때 새로운 객체를 반환 -> 수고를 덜어준다 불변객체는!
- 문자열 합치는 작업이 있을때 concat을 쓰는 것을 반드시 피하자!!
- https://jeong-pro.tistory.com/85
- 리터럴??   int a = 1;  1은 리터럴  상수는 변하지 않는 변수
- 장점이 뭔데?? https://galid1.tistory.com/622
- https://pjh3749.tistory.com/255
- **intern()** 메소드를 사용하면 해당 리터럴이 pool 에 존재하는지 화가인하고 존재하면 해당 pool 에 있는 리터럴을 리턴하고 없다면 리터럴을 pool 에 집어넣는다.


#String pool 의 위치
String pool 은 java 6 버전까지 Perm 영역이었다.
constoanl pool은 PermGen영역에 존재하게 된다
하지만 Perm 영역은 고정된 사이즈이며 Runtime 에 사이즈가 확장되지 않는다
그래서 intern 되는 String 값이 커지면 OutOfMemoryException을 발생시킬 수 있었고 그에따라 java 7 버전에서 heap 영역으로 String pool 의 위치를 변경하였다.


#String 깊숙히 파고들기
https://pjh3749.tistory.com/255
https://creatordev.tistory.com/81


#오토박싱과 언박싱

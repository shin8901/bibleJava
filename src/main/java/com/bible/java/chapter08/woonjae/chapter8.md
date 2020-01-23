#예외처리

>> try

>> catch

>> finally

catch  
**multi catch block - 여러 익셉션**
**익셉션은 왜 상속구조인가**

throw - 예외 발생, 재던지기
throws - 책임전가, 호출부로 ㅃㅃ

catch ? throws ?

두가지중 어느 방법이 옳은가

적정 스코프에 catch block으로 익셉션을 제어하고,
개발자간 논의를 거쳐 발생가능한 익셉션을 한부분에서 처리.
발생가능한 논리적인 익셉션에 대해서는, 비즈니스 로직상에서 catch block을 사용하여
익셉션을 방지하거나

뭔소리냐면 결국 개발자간 약속으로 적정선에 익셉션을 몰아서 처리하거나
익셉션처리가 단독으로 로직들은 알아서 처리하라.
 

try-with-resource
#java.lang패키지

 
#Object 클래스
  - 모든 클래스의 조상, 멤버변수는 없고 오직 11개의 메서드만 가지고 있다.
  - 기본적으로  equals메서드는 주소값을 비교하는 방식임 -> String,Integer,Date 등등 값만 비교하도로 오버라이딩 StringBuffer 클래스 제외
  3. Exception클래스의 모든 예외클래스의 조상이므로 모든 예외처리가 걸리게 된다
  
#String 클래스
 - 동일한 문자열이면 같은 hash값을 갖도록 오버라이딩 되어있다
 
#equals()
 - 두 객체의 내용이 같은지 확인하는 Method입니다. 
 
#hashcode()
 - 두 객체가 같은 객체인지 확인하는 Method입니다.
 - 일반적으로 해시코드가 같은 경우가 존재하지만 Object클래스에 정의된 객체의주소값으로 HashCode를 반환하기때문에 같은 값을 가질수 없다
 - hashCode의 사용 예 ) https://nesoy.github.io/articles/2018-06/Java-equals-hashcode
 - map에 객체를 넣을 경우 중복체크가 필요
 - 해싱기법을 사용하는 HashMap이나 HashSet과 같은 클래스에 저장할 객체라면 반드시 hashCode메서드를 오버라이딩 할것!
 -.hashCode()와 System.identityHashCode()의 차이점 -> https://datamod.tistory.com/57
 
#clone()
 - Cloneable 인터페이스를 구현해야함
 - super.clone()으로 객체 복사 -> 구현해야 가능한 이유는 작성자가 복제를 허용했다는 의미
 
#깊은 복사 VS 얕은 복사
 - 참조형 타입의 객체는 clone() 그대로 가져다 쓰면 주소값을 참조하기때문에 완벽한 복사가 아니다.
 - 추가적으로 리턴할 때 객체를 복사한후 새로생성하여 값을 전달한다. 




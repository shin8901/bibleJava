#변수 ( Variable )


예약어 = 키워드(Keyword) or 리져브드 워드(reserved word), 프로그래밍언어의 구문에 사용되는 단어

변수타입
기본형(Primitive type) : 계산을 위한 실제 값 저장
 - 논리형(boolean)
 - 문자형(char) : 문자를 내부적으로 정수(유니코드)로 저장
 - 정수형(byte, short, int, long) : int는 CPU가 가장 효율적으로 처리할 수 있는 타입. 메미로 절약은 byte or short
 - 실수형(float, double)


참조형(Reference type) : 기본형을 제외한 나머지 타입, 객체의 주소 저장

상수(constant) : 변수와 동일하게 값을 저장하나 변경 불가, final
final의 변수 명을 상수, 변수 or 상수의 값을 리터럴(literal)이라 함

리터럴을 사용하지 않고 상수를 사용하는 이유는 의미있는 이름을 붙여 코드의 이해와 수정을쉽게 하기 위해서!!

형변환(Casting) : 변수, 상수 타입을 다른 타입으로 변경하는것
() = 케스트 연산자 or 형변환 연산자
기본형과 참조형간 형변환은 불가
자동형변환 : 형변환은 생략이 가능, 단 값의 범위보다 더 큰 값을 저장하는 경우 에러 발생(명시적으로 형변환을 해주는 경우는 에러가 발생하지 않는다)
		 기존의 값을 최대한 보존 할 수 있는 타입으로 자동 형변환

**진법파트와 형변환 내용은 다시 한번 공부가 필요함(잘 이해 안됨)**
package com.bible.java.chapter3.donghwan;

public class Operator {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j==i++ 실행, i = "+i+" j = "+j);
		
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j==++i 실행, i = "+i+" j = "+j);
		
		System.out.println("=============================");
		i = 5;
		j = 5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = "+i+", j = "+j);
		
		
		//부호연산자 boolean과 char형 빼고 사용가능
		long a = -10;
		a = +a; //+1 곱하기
		System.out.println(a);
		a = -10;
		a = -a; //-1 곱하기
		System.out.println(a);
		//System.out.println(a instanceof Long);
		
		
		
		//비트연산자
		int aa = 5;
		System.out.println("~aa "+~aa);
		System.out.println("~aa "+~aa+1);
		System.out.println("~aa "+(~aa+1)); 
		System.out.println(Integer.toBinaryString(aa));
		System.out.println(Integer.toBinaryString(~aa));
		String a2 = Integer.toBinaryString(aa);
		String a3 = Integer.toBinaryString(~aa); //음수의 경우
		int a3_2 = (int)Long.parseLong(a3, 2);
		int a2_2 = Integer.parseInt(a2, 2); //2진수
		System.out.println(a2_2);
		System.out.println(a3_2);

		System.out.println("=============================");
		byte q = 10;
		byte z = 20;
		//int c = q + z; //형변환이 일어남
		byte c = (byte)(q + z);
		//byte c = (byte)q + z; //에러 -> 캐스트연산자가 덧셈 연산자보다 우선순위가 높다
		System.out.println(c);
		
		q = 10;
		z = 30;
		System.out.println((byte)(q*z)); //byte를 범위를 넘어서 8bit까지만 저장하고 자름
		System.out.println((q*z));
		
		int a1 = 1000000;
		int b1 = 2000000;
		long c1 = a1 * b1; //결과값은 int 
		System.out.println(c1);
		
		long a11 = 1000000 * 1000000; //결과값  int
		long b11 = 1000000 * 1000000L;
		System.out.println(a11);
		System.out.println(b11);
		
		int aaa = 1000000 * 1000000 / 1000000; //첫번째 계산에서 int값의 범위를 벗어난다
		int bbb = 1000000 / 1000000 * 100000;
		System.out.println(aaa);
		System.out.println(bbb);
		
		char ch = 'a'; //97
		char ch2 = ch;
		char ch3 = ' ';
		
		int i1 = ch + 1;
		
		char i2 = 'a' + 1; //이 경우는 리터럴간의 계산이기때문에 컴파일시에 컴파일러가 계산
		char i3 = (char)(ch + 1); //이 경우는 컴파일러가 미리 계산하지 못하기 때문에 형변환이 필요!
		System.out.println("i2 "+i2);
		System.out.println("i3 "+i3);
		
		ch3 = (char)(ch +1);
		ch2++;
		//ch2 =ch2+1; 에러 -> 결과값이 int
		ch2++;
		
		System.out.println("i1 = "+i1); //98
		System.out.println("ch = "+ch); //a
		System.out.println("ch2 = "+ch2); //c
		System.out.println("ch3 = "+ch3); //b
		
		System.out.println('a'); //대소문자간 코드값 차이는 32
		System.out.println((char)('a'-32));
		
		System.out.println(6 << 35); //35-32 =3  => 6*2^3 
		
	}
}
//참고 
//연산자 순위  https://toma0912.tistory.com/66
//https://enosent.tistory.com/81

package com.bible.java.chapter03.donghwan;


public class Operator2 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		
		System.out.println(shortPi);
		
		if(10 == 10.f) { //10을 float로 변환한 후에 값 비교
			System.out.println("같다");
		}
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.println("10.0 ==10.0f ? "+(10.0==10.0f));//10.0f이 double로 변환되어 10.0이 된다
		//0.1f를 double로 변환하면 0.1이 아닌 0.100000000000000001490어쩌구의 값을 얻는다
		//0.1에 가깝지만 0.1은 아님  -> 비교연산에 문제가 된다  형변환으로 두 피연산자의 형을 float로 맞추고 비교하거나 소수점을 잘라서 비교
		System.out.println("0.1==0.1f ? "+(0.1==0.1f));
		System.out.println("0.1==0.1f ? "+((float)0.1==(float)0.1f));
		System.out.println((double)0.1);
		System.out.println((double)0.1f);
	}
}

//xor 연산
//https://hashcode.co.kr/questions/1118/%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C-%EC%97%B0%EC%82%B0%EC%9E%90%EA%B0%80%ED%95%98%EB%8A%94-%EC%9D%BC%EC%9D%80-%EB%AD%94%EA%B0%80%EC%9A%94
//xor 연산의 활용
//http://hisjournal.net/blog/125
//https://m.blog.naver.com/PostView.nhn?blogId=oidoman&logNo=221145674383&proxyReferer=https%3A%2F%2Fwww.google.com%2F

//소수점
//부동소수점 부동의 부는 뜰 부자로 소수점이 이동 가능하다고 해서 붙여진 이름이다.
//https://ko.wikipedia.org/wiki/IEEE_754
//http://tcpschool.com/cpp/cpp_datatype_floatingPointNumber
//https://2xlarge.tistory.com/22
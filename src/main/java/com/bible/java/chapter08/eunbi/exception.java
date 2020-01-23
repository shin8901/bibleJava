package com.bible.java.chapter08.eunbi;

public class exception {

	
	//사용자 예외는 Mes4RouteException 요고 보기
	//
	
    public static void main(String[] args) {
    	try {
    		for(int i = 5; -1 < i ; i--) {
    			
    			System.out.println(10/i);
    		}
    		return;
    		
    		//cath문도 if문과 같고 조상클래스를 먼저 쓰면 자식클래스 exception은 에러가 난다.
    	} 
    	catch (ArithmeticException q) { //정상
			// TODO: handle exception
		}
    	catch (RuntimeException r) {
    		
    	}
//    	catch (ArithmeticException q) {		//에러
//			// TODO: handle exception
//		}
    	
    	finally {
			System.out.println("이건 무조건 실행");
		}
    }
}

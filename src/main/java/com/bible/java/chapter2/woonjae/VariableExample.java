package com.bible.java.chapter2.woonjae;

/**
 * <pre>
 * com.bible.java.chapter2
 * VariableExample.java
 *
 * 클래스 개요 : xxx를 처리하는 클래스
 * </pre>
 */
public class VariableExample
{

    private static int     intA;

    private static char    charA;

    private static boolean boolA;

    /**
     * <pre>
     *   
     * 처리내용 : xxx를 처리하는 메소드
     * </pre>
     * 
     * @Method Name : main
     * @param args
     */
    public static void main( String[ ] args )
    {
        int i;
        //System.out.println( i ); // -> 초기화 되지 않았기때문에 오류
        i = 0;
        System.out.println( i );

        System.out.println( intA ); // 클래스 변수, 혹 멤버 변수인 경우 초기화구문이 없더라도 강제 초기화
        System.out.println( charA ); // 클래스 변수, 혹 멤버 변수인 경우 초기화구문이 없더라도 강제 초기화
        System.out.println( boolA ); // 클래스 변수, 혹 멤버 변수인 경우 초기화구문이 없더라도 강제 초기화

    }

}

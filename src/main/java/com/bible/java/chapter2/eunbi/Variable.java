package com.bible.java.chapter2.eunbi;

public class Variable {
	
	/** 인스턴스 변수
	 *  인스턴스 변수는 인스턴스가 생성될 때 생성됩니다. 
	 *  그렇기 때문에 인스턴스 변수의 값을 읽어오거나 저장하려면 인스턴스를 먼저 생성해야합니다. 
	 *  인스턴스 별로 다른 값을 가질 수 있으므로, 각각의 인스턴스마다 고유의 값을 가져야할 때는 인스턴스 변수로 선언합니다.
	*/
	int iv = 1; 
	/** 클래스변수
	 * 클래스 변수는 인스턴스 변수에 static만 붙여주면 됩니다. 
	 * 인스턴스 변수는 각각 고유한 값을 가지지만 클래스 변수는 모든 인스턴스가 공통된 값을 공유하게 됩니다. 
	 * 한 클래스의 모든 인스턴스들이 공통적인 값을 가져야할 때 클래스 변수로 선언합니다.
	*/
	static int cv = 2; // 클래스 변수
	
	
    public static void main( String[ ] args )
    {
    	int num = 5;	//지역변수
    	
    	//DVO 담긴 변수
		VariableDVO  v = new VariableDVO();
		v.setNum(5);
		
		test(num, v);	    
		variable();
    }
    
    public static void test (int n, VariableDVO v) {
        String result1 =  plus(n, v);

        System.out.println("int	" + n);
        System.out.println("VariableDVO	" + v.getNum());
    }
    
    private static String plus(int n, VariableDVO v) {
    	//일반변수
    	n = n+5;
    	
    	//DVO 담긴변수
    	int num = v.getNum();
    	num = num+5;
    	v.setNum(num);
    	return "5 더하기";
    }

    
    
    public static void variable() {
    	int iv = 3;
    	int cv = 4;
    	System.out.println(iv);
    	System.out.println(cv);
    }
}

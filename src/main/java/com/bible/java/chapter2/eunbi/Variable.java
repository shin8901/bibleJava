package com.bible.java.chapter2.eunbi;

public class Variable {

    public static void main( String[ ] args )
    {
    	//일반변수
    	int num = 5;
    	
    	//DVO 담긴 변수
		VariableDVO  v = new VariableDVO();
		v.setNum(5);
		
		test(num, v);	    
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

}

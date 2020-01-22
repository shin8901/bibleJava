package com.bible.java.chapter8.donghwan;

import java.io.FileInputStream;

public class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork("+exception+")가 호출됨.");
		
		if(exception)
			throw new WorkException("WorkException발생!!");
	}
	
	public void close() throws CloseException {
		System.out.println("close()가ㅣ 호출됨");
		throw new CloseException("CloseException발생!!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}

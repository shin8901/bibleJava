package com.bible.java.chapter8.inkukC;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceEx {
	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);
		} catch (WorkException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (CloseException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true);
		} catch (WorkException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (CloseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

class CloseableResource implements AutoCloseable {
	
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception+")가 호출됨");
		
		if(exception)
			throw new WorkException("WorkException 발생");
	}
	
	@Override
	public void close() throws CloseException {
		// TODO Auto-generated method stub
		System.out.println("Close()가 호출됨");
		throw new CloseException("CloseException 발생");
	}
	
}

class WorkException extends Exception {
	public WorkException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class CloseException extends Exception {
	public CloseException(String msg) {
		super(msg);
	}
}
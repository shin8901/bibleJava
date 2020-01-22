package com.bible.java.chapter8.donghwan;

public class TryWithResource {

	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);
		}catch(WorkException e){
			e.printStackTrace();
		}catch(CloseException ie) {
			ie.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true);
		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

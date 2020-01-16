package com.bible.java.chapter7.donghwan.interface1;

import com.bible.java.chapter7.donghwan.Content;
import com.bible.java.chapter7.donghwan.Person;

public class SendA  {

	boolean send(Person sender, Person receiver, Content content) {
		writeHistory(); //망가짐
		return sendMail();
	}

	private void writeHistory() {
		System.out.println("서버 에러로인해 망가짐");
	}

	private boolean sendMail() {
		System.out.println("메일 성공");
		return true;
		
	}
}

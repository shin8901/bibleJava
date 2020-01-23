package com.bible.java.chapter07.donghwan.interface1;

import com.bible.java.chapter07.donghwan.Content;
import com.bible.java.chapter07.donghwan.Person;

public class SendB {

	boolean send(Person sender, Person receiver, Content content) {
		writeHistory(); //정상작동
		return sendMail();
	}
	private void writeHistory() {
		System.out.println("정상작동");
	}

	private boolean sendMail() {
		System.out.println("메일 성공");
		return true;
		
	}
}

package com.bible.java.chapter7.donghwan.interface1;

import com.bible.java.chapter7.donghwan.Content;
import com.bible.java.chapter7.donghwan.Person;

public class Sender implements MailInterface{

	SendA a;
	SendB b;
	@Override
	public boolean send(Person sender, Person receiver, Content content) {
		//A가 망가짐
//		a = new SendA();
//		return a.send(sender, receiver, content);
		
		//B로 교체
		b = new SendB();
		return b.send(sender, receiver, content);		
	}
}

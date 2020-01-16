package com.bible.java.chapter7.donghwan.interface1;

import com.bible.java.chapter7.donghwan.Content;
import com.bible.java.chapter7.donghwan.Person;

public interface MailInterface {
	
	boolean send(Person sender, Person receiver, Content content);
}

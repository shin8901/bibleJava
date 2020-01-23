package com.bible.java.chapter07.donghwan.interface1;

import com.bible.java.chapter07.donghwan.Content;
import com.bible.java.chapter07.donghwan.Person;

public interface MailInterface {
	
	boolean send(Person sender, Person receiver, Content content);
}

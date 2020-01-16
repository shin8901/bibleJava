package com.bible.java.chapter7.donghwan.interface1;

import com.bible.java.chapter7.donghwan.Content;
import com.bible.java.chapter7.donghwan.Person;

public class Program {

	public static void main(String[] args) {
		//메일 보내기 기능 구현
		Person sender = new Person("a", "32");
		Person receiver = new Person("b", "33");
		Content content = new Content("I got it");
		
		
		//바로 호출하는 경우
		//A가 망가졌을 경우에 사용자쪽에서 수정이 필요
		//SendA a = new SendA(); 
		//a.send(sender, receiver, content);
		SendB b = new SendB();
		b.send(sender, receiver, content);
		
		// 사용자쪽에서 수정이 필요
		//MailInterface mail = new SendA(); //망가졌다
		//MailInterface mail = new SendB(); //정상
		//mail.send(sender, receiver, content);
		
		//사용자쪽에서 수정할 필요 없어짐
		//이렇게 해놓고 밑에 개발 ( 후처리 등등)
		//사용자는 알 필요없고 알수도 없다(라이브러리로 제공?)
		MailInterface mail2 = new Sender();
		boolean results = mail2.send(sender, receiver, content);
		
		
	}
}

package com.bible.java.chapter7.woonjae;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {

		Object dd = new Object() {
			public void method() {
				System.out.println("헐");
			}

			@Override
			public String toString() {
				method();
				return super.toString();
			}
		};

		System.out.println(dd);

		// 익명클래스를 작성하는법은 보통 그 뭐시냐 람다식으로도 많이 사용함.

		Button d = new Button();
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		d.addActionListener(((ActionEvent e) -> {

		}));
	}
}

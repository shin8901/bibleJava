package com.bible.java.chapter07.donghwan;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("dh", "32");
		p.bite();
		System.out.println(Animal.IDX);
		
		Animal a = new Person("a", "b");
		//Person pp = new Animal("1","2");   자식 참조변수로 -> 부모인스턴스 만들기 불가능
		a.bite();
		Person pp = (Person) a;
		
		pp.bite();
		
		
		Person c = new Person("f","r");
		Animal rr = (Person) c;
		Animal dd =  c;
		
		
		Animal yy = new Animal("88");
		Person t = null;
		//t = (Person)yy; //컴파일시에는 에러나지 않는다 -> 참조변수간 타입만 확인하기 때문에
		
		System.out.println(p instanceof Animal);
		System.out.println(a instanceof Person);
		System.out.println(a instanceof Animal);
		System.out.println(yy instanceof Person); //부모 참조변수는 자식인스턴스가 아니다 -> 형변환 하지못한다
 	}
}

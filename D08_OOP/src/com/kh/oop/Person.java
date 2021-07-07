package com.kh.oop;

public class Person {
	////멤버변수////
	private /* 외부 접근 불가 */ String name;
	private int age;
	////멤버변수////
	
	////생성자//// -> 객체를 만들어주는 메소드 ()
//	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	////멤버변수////
	
	/////////////멤버메소드/////////////
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age; // 반환값의 자료형 int로 맞춰주기
	}
	
	public void setName(String name) {
		// person.setName에서 저장된 값이 여기로 옴
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	
	public void sayHello() {
		System.out.println("Hello Person");
	}
	public void introduce() {
		// 저장된 멤버변수 값을 이용해서 출력
		System.out.println("안녕하세요 "+name+"입니다. "+age+"살 입니다.");
	}
	/////////////멤버메소드/////////////

}

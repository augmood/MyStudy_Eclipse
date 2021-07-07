package com.kh.oop;

public class Person {
	////�������////
	private /* �ܺ� ���� �Ұ� */ String name;
	private int age;
	////�������////
	
	////������//// -> ��ü�� ������ִ� �޼ҵ� ()
//	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	////�������////
	
	/////////////����޼ҵ�/////////////
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age; // ��ȯ���� �ڷ��� int�� �����ֱ�
	}
	
	public void setName(String name) {
		// person.setName���� ����� ���� ����� ��
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	
	public void sayHello() {
		System.out.println("Hello Person");
	}
	public void introduce() {
		// ����� ������� ���� �̿��ؼ� ���
		System.out.println("�ȳ��ϼ��� "+name+"�Դϴ�. "+age+"�� �Դϴ�.");
	}
	/////////////����޼ҵ�/////////////

}

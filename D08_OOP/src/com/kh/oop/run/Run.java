package com.kh.oop.run;

import com.kh.oop.Person;

public class Run {
	public static void main(String [] args) {

		//�޸𸮿� ��ü ������
//		Person person = new Person(); // Person() ������
//		Person person = new Person("������");
		Person person = new Person("������", 16);
//		person.name = "������"; 
// 		-> �̰� ������  public String name; ��� ��  �ƴ� �ܺ�������
//		-> ���� �� public Person(String name) {
//			this.name = name;
//				}
//		person.setName("������"); //��������� �������� ����
		person.introduce();

		
	}

}

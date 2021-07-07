package com.kh.oop.run;

import com.kh.oop.Person;

public class Run {
	public static void main(String [] args) {

		//메모리에 객체 생성함
//		Person person = new Person(); // Person() 생성자
//		Person person = new Person("방윤담");
		Person person = new Person("방윤담", 16);
//		person.name = "방윤담"; 
// 		-> 이거 쓰려면  public String name; 써야 됨  아님 외부접근임
//		-> 여기 값 public Person(String name) {
//			this.name = name;
//				}
//		person.setName("방윤담"); //멤버변수에 방윤담을 저장
		person.introduce();

		
	}

}

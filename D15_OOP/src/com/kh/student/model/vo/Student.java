package com.kh.student.model.vo;

public class Student {
	
	private int classNumber;
	private String name;
	private int age;
	private String address;
	private double grade;
	
	// 생성자란 무엇이며, 생성자의 조건? 특징은 ?
	// 생성자 : 객체를 생성하고, 멤버변수를 초기화 한다. 
	// 맨 처음 실행되는 메소드, 반환형이 없고, 메소드명이 클래스명과 같다.
	public Student() {}
	
	public Student(int classNumber, String name, int age, String address, double grade) {
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
		this.address = address;
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 학번 : "+ classNumber + 
				", 주소 : "+ address +", 학점 : "+ grade;
	}
	
	
	

}

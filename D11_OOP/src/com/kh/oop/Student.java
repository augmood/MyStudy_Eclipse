package com.kh.oop;

//1명의 학생 데이터 저장용
public class Student {
	// 멤버변수, 접근제한자,  setter/getter, 캡슐화
	private String name; 
	private int kor;
	private int eng;
	private int math;
	
	public Student() {} // 생성자란? 값을 초기화 해주는 역할

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// getter setter 자동생성 : alt+shft+s, 우클릭 > Source
	// generate g and s

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		return this.kor + this.eng + this.math;
		
	}
	
	public double avg() { // 같은 클래스 선언한 메소드 사용
		return total() / 3.0;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.name + "kor : "+this.kor+"eng : "+this.eng+"math : "+this.math;
	}

}

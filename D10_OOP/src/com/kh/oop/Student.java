package com.kh.oop;


// 데이터 저장용
public class Student {
	
	///////// 멤버 변수 ///////// 
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	///////// 생성자  /////////  
	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 멤버변수, 값 저장, 값 출력
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// 매개변수, 멤버변수
	public void setKor(int kor) {
		this.kor = kor; 
		
	}
	
	public int getKor() {
		return kor; // 리턴값, 자료형, 반환형
	}
	
	public void setEng(int eng) {
		this.eng = eng;
		
	}
	
	public int getEng() {
		return eng; 
	}
	
	public void setMath(int math) {
		this.math = math;
		
	}
	
	public int getMath() {
		return math;
	}
	
	public int total() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}
	
	public double avg() { // 같은 클래스 선언한 메소드 사용
		double avg = total() / 3.0;
		return avg;
	}
	
	
}


package com.kh.oop.student;


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
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
		
	}
	
	public int getKor() {
		return kor;
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
	
	public double avg() {
		double avg = total() / 3.0;
		return avg;
	}
	
	
}


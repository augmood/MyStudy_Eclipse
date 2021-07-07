package com.kh.oop;


// ������ �����
public class Student {
	
	///////// ��� ���� ///////// 
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	///////// ������  /////////  
	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// �������, �� ����, �� ���
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// �Ű�����, �������
	public void setKor(int kor) {
		this.kor = kor; 
		
	}
	
	public int getKor() {
		return kor; // ���ϰ�, �ڷ���, ��ȯ��
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
	
	public double avg() { // ���� Ŭ���� ������ �޼ҵ� ���
		double avg = total() / 3.0;
		return avg;
	}
	
	
}


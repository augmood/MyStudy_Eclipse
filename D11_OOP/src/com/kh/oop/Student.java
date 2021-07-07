package com.kh.oop;

//1���� �л� ������ �����
public class Student {
	// �������, ����������,  setter/getter, ĸ��ȭ
	private String name; 
	private int kor;
	private int eng;
	private int math;
	
	public Student() {} // �����ڶ�? ���� �ʱ�ȭ ���ִ� ����

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// getter setter �ڵ����� : alt+shft+s, ��Ŭ�� > Source
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
	
	public double avg() { // ���� Ŭ���� ������ �޼ҵ� ���
		return total() / 3.0;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.name + "kor : "+this.kor+"eng : "+this.eng+"math : "+this.math;
	}

}

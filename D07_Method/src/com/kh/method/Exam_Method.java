package com.kh.method;

public class Exam_Method {
	public static void main(String [] args) {
		calcNumPrint();
		System.out.println("�Ű����� ���� ��ȯ�� �ִ� �޼ҵ�� ���: "+calcNum());
		calcNumPrint(500);
		System.out.println("�Ű����� �ְ� ��ȯ�� �ִ� �޼ҵ�� ���: "+calcNum(500));
	}
		
	static int calcNum(int x) {
		return x+500;
	}
	
	static void calcNumPrint(int x) {
		System.out.println("�Ű������� �ְ� ��ȯ�� ���� �޼ҵ�� ���: "+(x+500));
	}
	
	// void�� ���� �� ��ȯ���� X , but�̰� ��ȯ���� ������ ������ �����ָ� ���� ��ȯ�ϴ� ��
	static int calcNum() {
		return 5; 
	}

	// ��� ȣ���� ������ �ƴ� �׳� 5 ���� ������� �Ѱ���
	static void calcNumPrint() {
		System.out.println("�Ű����� ���� ��ȯ�� ���� �޼ҵ�� ��� : "+ 5);
	} 

} 

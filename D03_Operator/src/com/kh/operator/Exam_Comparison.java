package com.kh.operator;

// import java.util.Scanner;

public class Exam_Comparison {
	public static void main(String [] args) {
		
		//�� ������ : �� ���� ���ϴ� ������, ���� �����ڶ�� �ϱ⵵ ��
		//������ �����ϸ� T, �ƴϸ� F�� ��ȯ��.
		 
		System.out.println("�� ������ ����");
		
		int a = 50;
		int b = 30;
				
		boolean result1 = (a < b); // ��� ���� �޾��ִ� ����
		boolean result2 = (a == b);
		boolean result3 = (a != b);
		
		System.out.println("(a < b) result1 : " + result1);
		System.out.println("(a == b) result2 : " + result1);
		System.out.println("(a != b) result3 : " + result1);
		
		// ��������� (%)�� �񱳿����ڸ� �Բ� ���� ����
		// a�� Ȧ���ΰ�? ¦���ΰ�?
		
		boolean isEven = (a%2 == 0);
		System.out.println("a�� ¦�� �Դϱ�? " + isEven);
		
		
		
	}

}

package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {
	public static void main(String [] args) {
		
		// ���� �����
		// �ΰ��� ���� �Է� �޾Ƽ� ��Ģ����� ������ ���ϱ⸦ �ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է� : ");
		int first = sc.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int second = sc.nextInt();
		
		// ��Ģ����,�������� ���
		System.out.println("���ϱ� ��� : " + (first+second));
		System.out.println("���� ��� : " + (first-second));
		System.out.println("���ϱ� ��� : " + (first*second));
		System.out.println("������ ��� : " + (first/second));
		System.out.println("������ ��� : " + (first%second));
	}

}
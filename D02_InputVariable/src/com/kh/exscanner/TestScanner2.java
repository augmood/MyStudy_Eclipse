package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	
		// ������ �Է����ּ���
		System.out.println("������ �Է����ּ���.");
		int iNum = sc.nextInt();
		// �Ǽ��� �Է����ּ���
		System.out.println("�Ǽ��� �Է����ּ���.");
		double dNum = sc.nextDouble();
		// ���ڸ� �Է����ּ���
		System.out.println("���ڸ� �Է����ּ���.");
		// Scanner���� ���ڸ� �Է¹޴� ����� ��� ���ڿ��� �Է¹��� �� �߶� ���ڿ��ٰ� ������.
		char ch = sc.next().charAt(0); // �ѱ��ڸ� �߶� �ްڴ�.
		// ���ڿ��� �Է����ּ���
		System.out.println("���ڿ��� �Է����ּ���.");
		String str = sc.next();
	
		
		
		// �Է��� ������ :
		System.out.println("�Է��� ������ : "+iNum);
		// �Է��� �Ǽ��� :
		System.out.println("�Է��� �Ǽ��� : "+dNum);
		// �Է��� ���ڴ� :
		System.out.println("�Է��� ���ڴ� : "+ch);
		// �Է��� ���ڿ��� :
		System.out.println("�Է��� ���ڿ��� : "+str);
	}

}

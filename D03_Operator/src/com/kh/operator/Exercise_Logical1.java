package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// �Է��� �������� 1~100 ������ �������� Ȯ���Ͻÿ�
	// ������ �ϳ� �Է����ּ��� : 33
	// 1���� 100������ �����ΰ�? : T
	// ������ �ϳ� �Է����ּ��� : 120
	// 1���� 100������ �����ΰ�? : F
	
	System.out.println("������ �ϳ� �Է����ּ���.");
	int num1 = sc.nextInt();
	//boolean result1, result2;
	boolean isTrue = (1 <= num1) && (num1 <= 100);
	// result1 = (1 <= num1) && (num1 <= 100);
	System.out.println("1���� 100������ �����ΰ�? "+isTrue);
	
	}
}

package com.kh.control;

import java.util.Scanner;

public class Exam_if1 {
	public static void main(String [] args) {
		// �����ϳ� �Է����ּ��� : 44
		// ����Դϴ�.
		
		// �����ϳ� �Է����ּ��� : -1 
		// �����Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int num1 = sc.nextInt();
			
		if (num1 > 0) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.print("�����Դϴ�.");
		}

		System.out.println();

//		if (num1 < 0) {
//			System.out.println("�����Դϴ�.");
//		}
		
		// �Է¹��� ������ ���, 0, �������� �Ǻ��Ͻÿ�.
		// if�� 3���� ���� 3�� ��� ������ ������
		// else if�� ���� else if�� ���� �� else�� ���۾���.
		// �Է��� ���� 0�� �� ���̸� ������. 
		if (num1 > 0) {
			System.out.println("����Դϴ�.");
		} 
		// -> 0�� ������ ���Ե��� �ʰ� �� 
		else if (num1 == 0){
			System.out.println("0 �Դϴ�."); 
		}
		// �̷��Ը� ���� 0�� ��쵵 ���Ե�
		else {
			System.out.println("�����Դϴ�.");
		}
//		if (num1 == 0) {
//			System.out.print("0 �Դϴ�.");
//		}
//		if (num1 < 0 ) {
//			System.out.println("���� �Դϴ�.");
//		}

	}

}












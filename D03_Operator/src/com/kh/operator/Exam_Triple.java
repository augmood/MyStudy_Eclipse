package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		
		/*
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? �� , : ����
		 * - ���ǽ��� �ݵ�� T or F
		 * - ��/�������� �ַ� ���
		*/
		
		//�Է� ���� ������ �Ǻ��ϱ�
		Scanner sc = new Scanner(System.in); // -> ��ĳ�� ����
		
		System.out.println("���� �Է��ϼ���");
		int input1 = sc.nextInt(); // �� �ޱ�
		String resultStr3 = (input1 % 2) == 0 ? "¦��" : "Ȧ��";
		System.out.println(input1+"��/�� "+resultStr3+"�Դϴ�.");
		String resultStr4 = (input1 > 0) ? "���" : "����";
		System.out.println(input1+"��/�� "+resultStr4+"�Դϴ�.");
		
		// ¦�� Ȧ�� �Ǻ�
		
		int num = 34;
		// boolean isEven = (num % 2) == 0;
		String resultStr = (num % 2) == 0 ? "¦��" : "Ȧ��"; //-> ���׿�����
		System.out.println(num+"��/�� "+resultStr+"�Դϴ�.");
				
		// ��� ���� �Ǻ�
		int input = -4;
		String resultStr2 = (input > 0) ? "���" : "����";
		System.out.println(input+"��/�� "+resultStr2+"�Դϴ�.");

	}

}

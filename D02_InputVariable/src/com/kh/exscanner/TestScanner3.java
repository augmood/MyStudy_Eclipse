package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//�̸��� �Է��ϼ���
		System.out.println("�̸��� �Է��ϼ���");
		String na = sc.next();
		//�¾ ���� �Է��ϼ���
		System.out.println("�¾ ���� �Է��ϼ���");
		int bir = sc.nextInt();
		//Ű�� �Է��ϼ���
		System.out.println("Ű�� �Է��ϼ���");
		double he = sc.nextDouble();
		//������ �Է��ϼ���
		System.out.println("������ �Է��ϼ���");
		char gen = sc.next().charAt(0);
		//�ּҸ� �Է��ϼ���
		System.out.println("�ּҸ� �Է��ϼ���");
		sc.nextLine();
		String add = sc.nextLine();
		//next()�� ������ ���� ����, nextLine()�� ������ ���� �� ����
		
		//�̸��� ȫ�浿 �Դϴ�.
		System.out.println("�̸��� "+na+"�Դϴ�.");
		//�¾ ���� 6�� �Դϴ�.
		System.out.println("�¾ ���� "+bir+"���Դϴ�.");
		//Ű�� 185.2�Դϴ�.
     	System.out.println("Ű�� "+he+"�Դϴ�.");
		//������ �����Դϴ�.
     	System.out.println("������ "+gen+"���Դϴ�.");
		//�ּҴ� ����� ���α� �Դϴ�.
        System.out.println("�ּҴ� "+add+" �Դϴ�.");
	}

}

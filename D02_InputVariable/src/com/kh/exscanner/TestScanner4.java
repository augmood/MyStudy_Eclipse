package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �̸��� �Է����ּ���
		System.out.print("�̸��� �Է����ּ���");
		String name = sc.next();

		// �¾ ��
		System.out.print("�¾ ���� �Է����ּ���");
		int birthMonth = sc.nextInt();

		// �ּҸ� �Է����ּ���
		System.out.println("�ּҸ� �Է����ּ���");
		sc.nextLine(); // �ּҰ��� �Է¹޴� â���� ���� ��� �� -> ����
		String address = sc.nextLine();

		// Ű�� �Է����ּ��� -> ������ȯ
		System.out.println("Ű�� �Է����ּ���");
		double height = sc.nextDouble();

		// �����Ը� �Է����ּ��� -> �Ҽ��� ù��° �ڸ�
		System.out.println("�����Ը� �Է����ּ���");
		double weight = sc.nextDouble();

		// ������ �Է����ּ���
		System.out.println("������ �Է����ּ���");
		char gender = sc.next().charAt(0);

		// ��� â
		// System.out.println("�� �̸��� "+name+"�Դϴ�.");
		System.out.printf("�� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("�¾ ���� %d�� �Դϴ�.\n", birthMonth);
		System.out.printf("�ּҴ� %s �Դϴ�.\n", address);
//		System.out.println("Ű�� "+(int)height+"�Դϴ�."); //��������ȯ
		System.out.printf("Ű�� %d �Դϴ�.\n", (int)height);
		System.out.printf("�� �����Դ� %.1f �Դϴ�.\n", weight); // �Ҽ��� ù��° �ڸ�
//		System.out.println("������ "+gender+"�� �Դϴ�.");
		System.out.printf("������ %c�� �Դϴ�.", gender);

	}

}

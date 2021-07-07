package com.kh.oop;

import java.util.Scanner;

public class StudentList {

	// int [] kors = new int[3]; -> �̷��� �ᵵ ����
	int[] kors;
	int total;
	float avg;

	public StudentList() {
		kors = new int[3];
		total = 0;
		avg = 0;
	} // �⺻������

	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== ���� �޴� ========");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		return sc.nextInt();

	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < kors.length; i++) {
			do {
				System.out.print("�л� " + (i + 1) + "�� ����� : ");
				kors[i] = sc.nextInt();
				if (kors[i] < 0 || kors[i] > 100) {
					System.out.println("�ٽ� �Է����ּ���");
				}
			} while (kors[i] < 0 || kors[i] > 100);
		}

	}
	
	public void printScore() {
		for (int i = 0; i < kors.length; i++) {
		total = kors[i];
		System.out.println("�л�"+(i+1)+"�� ���� : "+kors[i]);
		}
		avg = total / kors.length;
		System.out.println("�հ� : " + total);
		System.out.printf("��� : %.1f \n", avg);
	}
}

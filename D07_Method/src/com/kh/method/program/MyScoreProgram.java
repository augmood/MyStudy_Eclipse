package com.kh.method.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String[] args) {

		/*
		 * ===== ���� �޴� ===== 
		 * 1. �����Է� 
		 * 2. ������� 
		 * 3. ���� ���� : 1
		 * 
		 * ===== ���� �Է� ===== 
		 * ���� : 50 
		 * ���� : 40 
		 * ���� : 30
		 * 
		 * ===== ���� �޴� ===== 
		 * 1. �����Է� 
		 * 2. ������� 
		 * 3. ���� ���� : 2
		 * 
		 * ===== ���� ��� ===== 
		 * ���� : 50 
		 * ���� : 40
		 *  ���� : 30
		 * 
		 * ���� : 120 ��� : 40.00
		 * 
		 * ===== ���� �޴� ===== 
		 * 1. �����Է� 
		 * 2. ������� 
		 * 3. ���� ���� : 3
		 * 
		 * G O O D B Y E - !
		 * 
		 */

		/*
		 * 1. ��ĳ�ʸ� ���� (���� �޾ƾ� �Ѵ�. -> ���� �޴°� �ΰ��� �ʿ� ���� ��ȣ�� ����) 
		 * 2. �޴��� �����ϸ� ������ ������� �����ش�.
		 * (switch case�� ) 
		 * 3. �ٽ� �� �޴��� ������ �Ѵ�. 
		 * 4. ���Ḧ ������ break �޼����� �߰� �Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		int[] kors = new int[3]; // �̰� ���� �Լ��� ���� ���� X kors ��� �迭�� ��� ȣ���ؾ���
		int total = 0;
		float avg = 0;

		EXIT: while (true) {
			int choice = showMenu();
			switch (choice) {
			case 1:
				System.out.println("===== ���� �Է� =====");
				insertScore(kors);
				break;
			case 2:
				System.out.println("===== ���� ��� =====");
				printScore(kors, total, avg);
				break;
			case 3:
				System.out.println("G O O D - B Y E");
				break EXIT;
			default:
				System.out.print("1~3 ������ ���� �Է����ּ���");
			}
		}
	}

	////////////////////////////// �Լ� //////////////////////////////////////
	// showMenu �޼ҵ�� �޴��� ����ϰ� ���� �Է¹޾� ��ȯ�ؾ���.
	// ctrl+shft+-
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �޴� =====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	static void insertScore(int[] kors) { // ��ȯ���� ���� ������ �� ������ �غ�����. ���� �޴��� �� �޴���.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < kors.length; i++) {
			do {
				System.out.println("�л� " + (i + 1) + "�� ���� :  ");
				kors[i] = sc.nextInt();
				if (kors[i] < 0 || kors[i] > 100) {
					System.out.println("�ٽ� �Է����ּ���");
				}
			} while (kors[i] < 0 || kors[i] > 100);
		}
	}

	static void printScore(int[] kors, int total, float avg) {
		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
			System.out.println("�л� " + (i + 1) + "�� ���� :  " + kors[i]);
		}
		avg = total / kors.length;
		System.out.println("�հ� : " + total);
		System.out.printf("��� : %.1f \n", avg);
	}
}

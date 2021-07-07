package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�. 
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum +=i;
			i += 2;
		}
		System.out.println("1���� 100���� Ȧ���� �� : "+sum);
		
	}
	
	public void exercise2() {
		// while���� �̿��Ͽ� ������ �ϳ� �Է¹޾� �� ���� 1 ~ 9������ �� �϶���
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����Ͻÿ�.
		
		Scanner sc = new Scanner (System.in);
		System.out.print("������ �Է����ּ��� : ");
		int dan = sc.nextInt();
		if (dan >=1 && dan <= 9) {
			int j = 1;
			while(j < 10) {
				System.out.printf("%d * %d = %d \n", dan, j, dan*j);
				j++;
			}
		}else {
			System.out.println("1 - 9 ������ ����� �Է��ؾ� �մϴ�.");
		}
	}
	
	public void exercise3() {
		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		// -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		while (num != -1) {
			sum+=num;
			System.out.print("���� �ϳ� �Է� : ");
			num = sc.nextInt();
		}
		System.out.println("�Է��Ͻ� ���� ���� : "+sum);
	}
		
	
	public void exercise4() {
		/*
		 *  while���� �̿��Ͽ� -1�� �ɶ����� ���� �������� �Է¹ް� ����� ����Ͻÿ�.
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  ������ ������ 5���̸� ����� 0.6�Դϴ�.
		 *  
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  -1
		 *  �Էµ� ���� �����ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum2 = 0;
		int count = 0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���. ");
		int input = sc.nextInt();
		while (input != -1) { //
			sum2+=input;
			count++;
			input = sc.nextInt(); //��� �Է��� �� �޾ƾ� �ϴϱ�!
		}
		if (count == 0 ) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}else {
			// ��� ���
			System.out.println("������ ������ "+count+"�� �̸�");
			System.out.println("�����"+(double)sum2/count+"�Դϴ�.");

		}

}
}


package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {
		// 1���� 100������ �ڿ��� �� Ȧ���� ���Ͽ� ����Ͻÿ�
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("Ȧ������ ���� : " + sum);
	}

	public void exercise2() {
		// ������ �ϳ� �Է� �޾Ƽ� �� ���� 1~9 ������ �� �϶���
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�."
		// �� ����Ͻÿ�. -> ���� �𸣰ھ� (if-else ������ �ذ��ϸ� �Ǵ� ����)

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ��� �Է����ּ���. : ");
		int j = sc.nextInt();
		if (j >= 1 && j <= 9) {
			// ������ ���
			for (int k = 1; k <= 9; k++) {
				// System.out.println(j+"*"+k+"="+k*j);
				System.out.printf("%d * %d = %d\n", j, k, j * k);
			}

		} else {
			System.out.println("1~9 ������ ����� �Է��ؾ� �մϴ�.");
		}

	}

	public void exercise3() {
		/*
		 * 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ� 1+2+3+4+5+6+7+8+9+10 = 55
		 */
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
				// 1+
				// 9
			} else {
				System.out.print("=");
				System.out.print(sum2);

			}

		}

	}
}

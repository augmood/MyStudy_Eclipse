package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		//�Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
		// ���� �ϳ� �Է��� �ּ��� : a
		// ���� �빮�� Ȯ�� : F
		// ���� �ϳ� �Է����ּ��� : A
		// ���� �빮�� Ȯ�� : T

		System.out.println("���� �ϳ� �Է����ּ���");
		char ch = sc.next().charAt(0);
		boolean check = (ch >= 'A') && (ch <= 'Z'); // -> ���� ������
		System.out.println("���� �ϳ� �Է����ּ���");
		int input = sc.nextInt();
		System.out.println("���ڷ� ��ȯ : "+(char)input);
		
		// -> �빮�ڸ� ���� �ؾ����� �𸣰; ��� ������
		// �ƽ�Ű �ڵ�ǥ �������� �빮�ڸ� �Ǻ��մϴ�. (���� ������ ���ڰ� �־ �̷��� �Ǻ��մϴ�)
		System.out.println("���� �빮�� Ȯ�� "+ check);
		
	}

}

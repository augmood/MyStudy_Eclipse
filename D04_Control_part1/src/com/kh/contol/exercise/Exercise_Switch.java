package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	
//	public void exercise1() {
		// 1-3 ������ ������ �Է¹޾�
		// 1�� ��� ������ �Դϴ�.
		// 2�� ��� �Ķ��� �Դϴ�.
		// 3�� ��� �ʷϻ� �Դϴ�.
		// �� ���� ������ �Է� �� ��� �߸� �Է��ϼ̽��ϴٸ� ����ϼ���.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("������ �Է����ּ��� : ");
//		int num1 = sc.nextInt();
//		
//		switch(num1)
//		{
//		case 1 :
//			System.out.println("������ �Դϴ�.");
//			break;
//		case 2:
//			System.out.println("�Ķ��� �Դϴ�.");
//			break;
//		case 3:
//			System.out.println("�ʷϻ� �Դϴ�.");
//			break;
//		default :
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
//		
//	}
	
//	public void exercise2() {
//		
//		 /* ���� �ΰ��� �����ȣ ���� 1���� �Է¹޾Ƽ�
//		 * �����ȣ����(+ - *,/)�� �ش��ϴ� ����� �����ϰ� ����ϼ���
//		 * ��, �� ���� ���ڸ� �Է��� ��� �����ڸ� �߸��Է��ϼ̽��ϴٸ� ����ϼ���.
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ù��° ������ �Է����ּ��� : ");
//		int input1 = sc.nextInt();
//		System.out.print("�ι�° ������ �Է����ּ��� : ");
//		int input2 = sc.nextInt();
//		System.out.print("�����ȣ ���ڸ� �Է����ּ��� : ");
//		char ch = sc.next().charAt(0);
//		int result = 0; // 0�� result�� �����ϰ� ���⿡ ��갪�� �޾���
//		switch (ch)
//		{
//		
//		//System.out~ ��¹��� �ѹ��� ������ ������?
//		
//		case '+' :
//			result = (input1+input2); 
//		break;
//		case '-' :
//			result = (input1-input2);
//		break;
//		case '*' :
//			result = (input1*input2);
//		break;
//		case '/' :
//			result = (input1/input2);
//		break;
//		default :
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
//		System.out.println("��� �� : "+result);
//	}
	
	public void exercise3() {
		/*
		 * 1-12 ������ ���ڸ� �Է¹޾� �ش��ϴ� ���� ���� ������ ��¥�� ����ϼ���.
		 * �� ���� ���ڸ� �Է��� ��� 1-12 ������ ���ڸ� �Է��ϼ��並 ����ϼ���.
		 * 
		 * 1�� - 12������ �� �ϳ��� �Է��ϼ��� : 3;
		 * �Է��Ͻ� ���� 31�� ���� �Դϴ�.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12�� �� �ϳ��� �Է����ּ��� : ");
		int inputMonth = sc.nextInt();
		
		
		switch (inputMonth) 
		{
		case 1: //31 
		case 3 : //31
		case 5 : //31
		case 7 : //31
		case 8 : //31
		case 10 : //31
		case 12 : //31 -> ������ ��Ƶΰ� �극��ũ�� ����� �����͸� �� ����ؼ� ����� !
			System.out.println("�Է��Ͻ� ���� 31�� ���� �Դϴ�.");
		break;
		
		case 2: //28, 29
			System.out.println("�Է��Ͻ� ���� 28�� or 29�� ���� �Դϴ�.");
		break;

		case 4 : //30
		case 6 : //30
		case 9 : //30
		case 11 : //30
			System.out.println("�Է��Ͻ� ���� 30�� ���� �Դϴ�.");
		break;
		
		default :
		System.out.println("1-12 ������ ���ڸ� �Է��ϼ��並 ����ϼ���.");
		}
	}	
}
	

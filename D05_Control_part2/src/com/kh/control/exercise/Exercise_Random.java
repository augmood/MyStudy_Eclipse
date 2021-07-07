package com.kh.control.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {
	public void exercise1() {
		// ���� �� �� ���߱�
		// 1 �Ǵ� 2 ���� -> ������ ����
		// �Է°��� �ް� ����� ������ ���Ͽ� ������ ����, �ٸ��� ����
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		// 1 �Ǵ� 2 ���� �� ������ ����
		// 1 ~ 2 ������ ����
		// rand.nextInt()
		int coin = rand.nextInt(2)+1; // -> +1�� �ؾ� ������ �Ǵ� ��
		System.out.print("���ڸ� �Է����ּ��� (�ո� 1 / �޸� 2): ");
		int player = sc.nextInt();
		
		if (coin == player) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
	/* ��������
	 * 1. ���ѹݺ� ����
	 * 2. 1, 2���� ���� �����ϸ� �ٽ� ����
	 * 3. 0�� �Է��ϸ� ���� ����
	 */


	public void exercise2() {
		// ����/����/��
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 1
		// ����� ������ �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// ��ǻ�Ͱ� �¸��Ͽ����ϴ�..loser..
		
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 2
		// ����� ������ �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// �����ϴ�!!
		
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 3
		// ����� ���� �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// �÷��̾ �¸��Ͽ����ϴ�!!

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rcp = rand.nextInt(4)+1; // -> +1�� �ؾ� ������ �Ǵ� ��
		System.out.print("���� ���� ���� �Է��ϼ��� (���� 1 / ���� 2 / �� 3): ");
		int player1 = sc.nextInt();
		
		if (rcp == player1) {
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�����ϴ�.");
		} else if (rcp == 1  && player1 == 3)
		{
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �����ϴ�.");
		}
		else if (rcp == 1  && player1 == 2)
		{
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �̰���ϴ�.");
		}
		else if (rcp == 2  && player1 == 1)
		{
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �����ϴ�.");
		}
		else if (rcp == 2  && player1 == 3)
		{
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �����ϴ�.");
		}
		else if (rcp == 3  && player1 == 1)
		{
			System.out.println("�÷��̾��"+player1+"��/�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �����ϴ�.");
		}
		else if (rcp == 3  && player1 == 2)
		{
			System.out.println("�÷��̾��"+player1+"�� �½��ϴ�.");
			System.out.println("��ǻ�ʹ�"+rcp+"�� �½��ϴ�.");
			System.out.println("�÷��̾ �̰���ϴ�.");
		}

	}

	public void exercise3() {
		// UP & DOWN ����
		// �� ������ 1 ~ 100 ������ �� �ϳ��� ���ߴ� �����Դϴ�
		// 0�� �Է��ϸ� ������ �����մϴ�.
		// ���ڸ� �Է����ּ���(user) : 55
		// UP!!
		// ���ڸ� �Է����ּ���(com) : 35
		// UP!!
		// ���ڸ� �Է����ּ���(user) : 66
		// DOWN!!
		// ���ڸ� �Է����ּ���(com) : 22
		// DOWN!!
		// ���ڸ� �Է����ּ���(user) : 11
		// user�� ������ 3������ ������ϴ�!!
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int updown = rand.nextInt(101)+1;
		System.out.print("1�� 100 ������ �� �ϳ��� �Է��ϼ��� : ");
		int player2 = sc.nextInt();
		
	
		while (true) {
			if (updown == player2) {
				System.out.print("�����Դϴ�.");
			} else if (updown > player2) {
				System.out.print("DOWN");
			} else if (updown < player2) {
				System.out.print("UP");			
			} else break; 
			{
				System.out.print("������ �����մϴ�.");
				
			}

		}
	}
}

package com.kh.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String [] args) {
		/*
		 * ===== ���� �޴� =====
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 * 
		 * ===== ���� �Է� =====
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ===== ���� �޴� =====
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 
		 * 
		 *  ===== ���� ��� =====
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ���� : 120
		 * ��� : 40.00
		 * 
		 *  ===== ���� �޴� =====
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 3
		 * 
		 * G O O D B Y E - !
		 * 
		 */
		
		/*
		 * 1. ��ĳ�ʸ� ���� (���� �޾ƾ� �Ѵ�. -> ���� �޴°� �ΰ��� �ʿ� ���� ��ȣ�� ����)
		 * 2. �޴��� �����ϸ� ������ ������� �����ش�. (switch case�� )
		 * 3. �ٽ� �� �޴��� ������ �Ѵ�.
		 * 4. ���Ḧ ������ break �޼����� �߰� �Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int total = 0;
		float avg = 0;
		
		���� : // -> while ���ѷ��� �ۿ��ٰ� �����ϸ� break ���� �ɾ ������ ������
		while(true) {
		System.out.println("===== ���� �޴� =====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		 
		switch(choice) {
		case 1:
			System.out.println("===== ���� ��� =====");
			do { // ------> ��ȿ�� ���� ���� ������ �ƴϸ� ��� �ٽ� ���ڴ�.
				System.out.print("���� : ");
				num1 = sc.nextInt(); // -> ������ ������ ���� ���ڴ�
				if(num1 < 0 || num1 > 100) {
					System.out.println("�ٽ� �Է����ּ���");	
				}
			}while(num1 < 0 || num1 > 100);
			do {
				System.out.print("���� : ");
				num2 = sc.nextInt();
				if(num2 < 0 || num2 > 100) {
					System.out.println("�ٽ� �Է����ּ���");	
				}
			}while(num2 < 0 || num2 > 100);
			do {
				System.out.print("���� : ");
				num3 = sc.nextInt();
				if(num3 < 0 || num3 > 100) {
					System.out.println("�ٽ� �Է����ּ���");	
				}
			}while(num3 < 0 || num3 > 100);
			break;
			
		case 2:
			//-> case1�� �������� ���� �ȵ�����
			//-> num���� case1 �ȿ��� ���� �Ǿ��� ������ ���⼭ �� �� X
			//-> �ƿ� �ٱ��� ���� ������ ���־�� �� -> �̰� ������
			System.out.println("===== ���� ��� =====");
			total = num1+num2+num3; //---> �� (���� ������)
			avg = total/3.0f;
			System.out.println("���� : "+num1); 
			System.out.println("���� : "+num2);
			System.out.println("���� : "+num3);
			
			System.out.print("���� : "+total);
			System.out.printf("  ��� : %2F \n", avg);
			break;
		case 3:
			System.out.println("G O O D B Y E !");
			break ����;
		default :
			System.out.println("1~3 ������ ���ڸ� �Է����ּ���");
			System.out.println();
			} 
				
		}
	}
}



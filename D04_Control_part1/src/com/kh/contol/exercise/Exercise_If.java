package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_If {
	
//	public void exercise1() {
		
		// Ű����� ������ �Է¹ް� �Է¹��� ������ ����̰�
		// ¦���� �� "¦����"�� ����ϰ� ¦���� �ƴϸ� "Ȧ����" ���
		// ��, ����� �ƴϸ� "����� �Է����ּ���"�� ����ϼ���
		
		// �����ϳ� �Է����ּ��� : 4
		// ¦����.
		
		// ���� �ϳ� �Է����ּ��� : -2
		// ����� �Է����ּ���.
//		System.out.println("ù��° ���� �����Դϴ�.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ϳ� �Է����ּ��� : ");
//		int num1 = sc.nextInt();
		
//		if (num1 > 0) {
//			if (num1%2 == 0 ) {
//			System.out.println("¦����.");
//			} 
//			else if (num1%2 != 0 ) {
//				System.out.println("Ȧ����."); 
//			}
//		}
//		else {
//			System.out.println("����� �Է����ּ���.");
//		}
//		
//	}
	
//	public void exercise2() {
//		System.out.println("�ι�° ���� �����Դϴ�.");
//		/*
//		 * 1.�Է�
//		 * 2.����
//		 * 3.��ȸ
//		 * 4.����
//		 * 0.����
//		 * �޴� ��ȣ�� �Է��ϼ��� : 3
//		 * ��ȸ�޴� �Դϴ�.
//		 * �߸� �Է��ϼ̽��ϴ�.
//		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1.�Է� ");
//		System.out.println("2.����");
//		System.out.println("3.��ȸ");
//		System.out.println("4.����");
//		System.out.println("0.����");
//		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
//		int select = sc.nextInt();
//		if (select == 0 ) {
//			System.out.println("�����Ͻðڽ��ϱ�?");
//			
//			}else if (select == 1 ) {
//				System.out.println("�Է¸Ŵ��Դϴ�."); 
//			}
//			else if (select == 2 ) {
//				System.out.println("�����޴��Դϴ�."); 
//			}
//			else if (select == 3 ) {
//				System.out.println("��ȸ�޴��Դϴ�."); 
//			}
//			else if (select == 4 ) {
//				System.out.println("�����޴��Դϴ�."); 
//			}
//		
//		else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
//		
//	}
	
//		public void exercise3() {
//			System.out.println("����° ���� �����Դϴ�.");
//			
//			/* 
//			 * �߰���� �⸻��� �������� �⼮Ƚ���� �Է��ϰ�
//			 * Pass Fail�� ����ϼ���.
//			 * �� ������ �߰���� 20% �⸻��� 30% ���� 30% �⼮ 100%�� �̷�����ְ�
//			 * �� ��, �⼮ ������ �� ���� Ƚ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ���
//			 * 70�� �̻��� ��� Pass(�⼮ Ƚ�� ����), 70�� �̸��̰ų�
//			 * ��ü ������ 30% �̻� �Ἦ�� Fail�� ����ϼ���.
//			 * 
//			 * �߰���� ���� (20) : 70
//			 * �⸻��� ���� (30) : 80
//			 * �������� (30) : 77
//			 * �⼮���� (100) : 18
//			 * 
//			 * ���� : 78
//			 * Pass�Դϴ�.
//			 * 
//			 * Fail�� ���
//			 * ���� ��� / �⼮ �̴�
//			 * Fail [�⼮ Ƚ�� ����] (13/20)
//			 * 
//			 * �����̴�  / �⼮ ���
//			 * Fail [���� �̴�] (���� : 68)
//			 * 
//			 * �����̴� / �⼮�̴�
//			 * Fail [�⼮ Ƚ�� ����] (13/20)
//			 * Fail [���� �̴�] (���� : 68)
//			 */
//			Scanner sc = new Scanner(System.in);
//			System.out.print("�߰� ��� ������ �Է��ϼ��� : ");
//			int mid = sc.nextInt();
//			System.out.print("�⸻ ��� ������ �Է��ϼ��� : ");
//			int fin = sc.nextInt();
//			System.out.print("���� ������ �Է��ϼ��� : ");
//			int homework = sc.nextInt();
//			System.out.print("�⼮ Ƚ���� �Է��ϼ��� : ");
//			int attendance = sc.nextInt();
//			
//			// ���� ȯ�� (���� �ݿ�) �� ���ϱ�
//			double midTerm = mid*0.2;
//			double finTerm = fin*0.3;
//			double hw = homework*0.3;
//			double total = midTerm+finTerm+hw+attendance;
//			
//			//total���� 70�� �̻��̰� �⼮Ƚ���� 70%�ʰ��� ��� PASS
//			
//			if (total >= 70 && attendance > 20*0.7) 
//			{
//				System.out.println("���� : "+total);
//				System.out.println("Pass �Դϴ�.");
//			} else {
//				if(total >= 70) {
//					// ������� / �⼮�̴�
//					System.out.println("FAIL [�⼮ Ƚ�� ����] : ("+attendance+"/20)");
//				}else if (attendance > 20*0.7) {
//					// �����̴� / �⼮���
//					System.out.println("FAIL [���� �̴�] : "+total);
//				}else {
//					System.out.println("FAIL [���� �̴�] : "+ total);
//				    System.out.println("FAIL [�⼮ Ƚ�� ����] : ("+attendance+"/20)");
//				}
//			}
////			else if (total >= 70 && attendance < 20*0.7)
////			{	
////				System.out.println("FAIL [�⼮ Ƚ�� ����] : ("+attendance+"/20)");
////				
////			}
////			else if (total < 70 && attendance > 20*0.7)
////			{	
////				System.out.println("FAIL [���� �̴�] : "+total);
////				
////			}
////			else if (total < 70 && attendance < 20*0.7)
////			{	
////				System.out.println("FAIL [���� �̴�] : "+ total);
////				System.out.println("FAIL [�⼮ Ƚ�� ����] : "+ attendance+"/20");
////				
////			}
//			
//		}
//
	}



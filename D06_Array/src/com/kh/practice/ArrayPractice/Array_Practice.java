package com.kh.practice.ArrayPractice;

import java.util.Random;
import java.util.Scanner;

public class Array_Practice {
	public void pracitce4() {
		/*
		 * ���̰� 5�� String �迭�� �����ϰ� "���", "��", "����", "������", "����"�� �ʱ�ȭ �� ��
		 * �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���
		 */
		
		String [] arrs = {"���", "��", "����", "������","����"};
		for (int i = 0; i < 5 ; i++) {
			if(arrs[i].equals ("��"))
			System.out.print(arrs[i]);
		}
		System.out.println();
	}
	
	public void practice7() {
		/*
		 * ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		 * �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���. ---> ????
		 * �׸��� �迭 ��ü�� ���� �����ϰ� �� �ε����� ������ ������ ���� ����ϼ���.
		 */
		
		// �迭�� ���̸� �Է� �ް� �Ҵ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();	
		int [] arrs = new int[num];   // ���� �Է� �ް� ������ �迭 ����
		int sum = 0;

		for(int i = 0; i < arrs.length; i++) {
			System.out.printf("�迭 %d��° �ε����� ���� �� : ", i); // ���⼭ �̰� ��� �޾ƾ� �ϴ���??����
			arrs[i] = sc.nextInt();
		}
		for(int i = 0; i < arrs.length; i++) {  // ���� ������� ����ϰ�, �հ� ����ϱ� 
			System.out.print(arrs[i]+" ");
			sum+=arrs[i];
		}
		System.out.println();
		System.out.print("�հ� : "+sum);
			
		
	}
	
	public void pracitce11() {
		/*
		 * �ζǹ�ȣ �ڵ������� ���α׷� �ۼ�, �ߺ� �� ���� ������������ �����Ͻÿ�
		 */
		
		// �ζ� �迭�� �޴´�.
		int [] lotto = new int [6];
		
		// 1~45 ������ ���ڸ� �����ϰ� �迭�� �Է��մϴ�.
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1; // 0~44 -> 1~45
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
					// ���� ���� ������ �ٸ� ���� ���
					// i--�� ���� ������ ���������� �������� ������ �� �ڸ��� �̰� ��
					
					break; 
				}
				
			}
		}
		// ������������ �����Ѵ�.
		// ���������� �����
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < (lotto.length-1)-i; j++) {
				if (lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		for (int i= 0; i <lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
			
//		Random rand = new Random(); // �����ϰ� ���� ��������
//		int [] lotto = new int[6]; // �ζǴ� �����ڸ��ϱ� �����ڸ��� ���� �迭�� ������ٰ���
//		for(int i = 0; i < lotto.length; i++) { 
//			lotto[i] = rand.nextInt(45)+1; // �ζǴ� �� 45���� �� �� ���� 
//			for (int j = 0; j < i; j++) {
//					if (lotto[i] == lotto[j]) { // �� �κ��� �� �𸣰��� �ߺ� �� ���� ���� �޴� �� ����
//						 i--;
//					}
//			}
//			for(int k = i; k > 0; k--) {
//						int temp = lotto[k-1]; // ������������ ���� �����غ����� �ؿ� 
//						lotto[k-1] = lotto[k];
//						lotto[k] = temp;
//			} 
//		} for(int i = 0; i <lotto.length; i++) { // �ζ� ��ȣ�� �����Ұ���
//			System.out.print(lotto[i]+" ");
//		}
		
	} 
		
	
	public void pracitce12() {
		
	}

}



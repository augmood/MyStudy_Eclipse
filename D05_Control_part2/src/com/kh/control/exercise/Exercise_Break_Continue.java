package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Break_Continue {
	
	public void exercise1() {
		/* �����ϳ��� �Է¹��� ��
		 * 1���� �Է��� ���ڱ����� ���� ����Ͻÿ�
		 * 
		 * ���� �ϳ� �Է��ϼ��� : 5
		 * 1���� 5������ �� : 15
		 * 
		 * 1+2+3+4
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) 
		{
			
			sum = sum+num;
			i++;
		}
		/* 
		 * int i = 1; // 1���� ���ؾ��ϴϱ�
		 * while(true) {
		 *  sum += i; // 1���� i���� ���ؾ��� 
		 *  if (i == num) break; // i�� �Է��� �������� ���ؾ���
		 *  i++;
		 */ 
		System.out.println("1���� "+num+"������ ���� : " + sum);

	}
	
	public void exercise2() {
		/*
		 * 1���� 100������ �������� ���� ����ϴµ�
		 * 4�� ����� ���� ���Ͽ� ����Ͻÿ�.
		 * 
		 */
	
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			
			//i�� 4�� ����̸� sum+=i�� ������� �ʵ��� ��
			//continue�� ����Ǹ� �ٷ� ���������� �� �� ���ǽ� ����
			if (i%4 == 0) continue;
			sum2 += i;
		}
		
		System.out.println("���� "+sum2);

	}
	


}
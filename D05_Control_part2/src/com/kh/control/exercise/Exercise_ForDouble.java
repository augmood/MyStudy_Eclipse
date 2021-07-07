package com.kh.control.exercise;

public class Exercise_ForDouble {
	
	public void exercise1() {
		/*
		 * 0�� 0�к��� 23�� 59�б��� ����ϱ�
		 * 0�� 0��
		 * 0�� 1��
		 * 0�� 2�� 
		 * ....
		 * 23�� 59��
		 */
		for(int i = 0; i < 60; i++) {
			for(int j =0; j < 24; j++)
				System.out.printf("%2d�� %2d��\n", j, i);
		}
	}

	public void exercise2() {
		/*
		 * �������� ����ϵ�
		 * 2�� ���� 3��, 3�� ���� 4��
		 * 
		 * 2 tap 3 tap 4 tap 5 
		 */
		for(int k = 1; k <10; k++) { // ����
			for(int l = 2; l <10; l++) { // ����
				System.out.printf("%d * %d = %d \t", l , k, l*k);
			}
			System.out.println();
		}
		
	}
	
	public void exercise3() {
		
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		
		for(int m  = 0; m < 10; m++) { // ����
			for(int n = 0; n < m+1; n++) { 
				// �� ���� ---> �̰� ���� ���, ���κ��� ���ΰ� �ϳ� ���� ��µǾ�� �� 
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

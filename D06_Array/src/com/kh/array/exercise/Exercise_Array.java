package com.kh.array.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		/*
		 * ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		 * ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 */
		
		int [] arr1 = new int[100]; // ���̰� 100�� �迭�� ����
		for (int i = 0; i < 100; i++) { 
			arr1[i] = i+1; // ���� �־���
			System.out.print(arr1[i]+ " "); // �������
		}
	}
	public void exercise2() { // ���ڸ� ����Ϸ��� ���ڷ� �޾ƾ� �ϴµ� ��������
		/*
		 * ���̰� 5�� String �迭�� �����ϰ� "����", "������", "Ű��", "���", "�ٳ���"��
		 * �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ����غ�����! 
		 */
		
		String [] arr2 = {"����", "������", "Ű��", "���", "�ٳ���"}; // �迭 ����
		for(int j = 0; j < 5; j++) {
			if (arr2[j].equals ("����")) { 
				// ���� = ���� -> �Է°� ��� / ���ڿ� == �� ���� ����
				// String ���� == �� �ּ� �� ��, equals�� value�� �� (����)
				System.out.print(arr2[j]);			            
			}
			String kiwi = "Ű��";
			String badkiwi = new String("Ű��");
			System.out.println("badkiwi : " + badkiwi); // Ű�� ����
			System.out.println("�ּҰ� �� : " + (kiwi == badkiwi));
			System.out.println("���ڿ� �� : " + kiwi.equals(badkiwi));
		}
	}
	
	public void exercise3() { // �Է� ���� ���� �����ϱ�....
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		int [] arr3 = new int[5]; 
		int max = 0;
		System.out.print("���� ���� 5���� �Է��ϼ��� : ");

		for(int k = 0; k < 5; k++) {
			arr3[k] = sc.nextInt();
			//���� ū �� �Ǻ�
			if (arr3[k] > max) { //�� �κп��� ��̴ٳ�
				max= arr3[k];
				}
			}
		//���� ū �� ���
		System.out.println("���� ū ����"+max+"�Դϴ�");
	}
	
	
	public void exercise4() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int [] arr4 = new int[5];
		int sum = 0;
		System.out.print("��� 5���� �Է��ϼ���: ");
		
		for(int l = 0; l <arr4.length; l++) {
			arr4[l] = sc.nextInt();
			// ������ ����� ���ϱ�
			sum += arr4[l];
		}
		System.out.print("��� : "+(double)sum/5);

	}
	
	public void exercise5() {
		/* 
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		 * �����ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		 * 210618-1124600 -> 210618-1******
		 * 890831-2123456 -> 890831-2******
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է����ּ��� : ");
		String str = sc.next();
		// ���� �迭�� ����, ������ �� ���ڿ��� �߶� ���ڷ� ����
		str.charAt(0);
		// �Է� ���� ���ڿ��� ���̸�ŭ ���ڹ迭�� ����.
		char [] origin = new char[str.length()];
		for (int m = 0; m < origin.length; m++) {
			// m�� 0���� 13���� ���ڿ��� �ϳ��� ���� ���� �迭�� ����
			origin[m] = str.charAt(m); 
		}
		//�Ȱ��� ũ���� ������ ������ְ� for������ ���縦 �Ѵ�.
		char [] copy = new char[str.length()];
		for(int m = 0; m < copy.length; m++) {
			if ( m <= 7 ) { // 890831-2 ������ ���� ���ڷ� �̰ڴ�.
				copy[m] = origin[m]; 
			}else {
				copy[m] = '*'; 
			}
			System.out.print(copy[m]);
		}
		// �ֹε�Ϲ�ȣ�� ����� ���ڿ��� �����ϵ�
		// ���� �ڸ� ���ĺ��ʹ� *�� ó���Ͽ� ����

		
	}
	
	public void exercise6() {
		/*
		 * �ټ����� ���� �Է� ���� �Ŀ�
		 * ���������� �̿��Ͽ� ������������ ������ �� ����Ͻÿ�
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("5���� ���� �Է��ϼ��� : "); 
		int [] arr5 = new int[5];
		
		// �Է¹��� ���� �迭�� ���� -> �� �κ� ������ �ǳ� ����
		for (int n = 0; n < arr5.length; n++) { 
			arr5[n] = sc.nextInt();
		}
		// �������� ���� �����ϴ� ��
		for (int n = 1; n < arr5.length; n++) { 
			for(int o = n; o > 0; o--) {
				if(arr5[o-1] > arr5[o]) {
				int temp = arr5[o-1];
				arr5[o-1] = arr5[o];
				arr5[o] = temp;
				}
			}
		
	}
		// ���
		for (int n = 0; n < arr5.length; n++) {
			System.out.print(arr5[n]+" ");
		}
	}
}

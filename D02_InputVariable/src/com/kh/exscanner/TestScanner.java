package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		//���� �Է��� �޾� ���α׷� �ۼ� (import)
		Scanner sc = new Scanner(System.in); //��ĳ�ʴ� �̷��� ����Ѵ�.
		
		System.out.println("int ���� �Է����ּ���.");
		int input1 = sc.nextInt(); //���� �Է°� �ޱ� -> ���� ������ ���� �װ� �Ǵ°�
		System.out.println("�Է��� ���� : "+input1);
		
		System.out.println("�ι�° int ���� �Է����ּ���.");
		int input2 = sc.nextInt();
		System.out.println("�Է��� ���� : "+input2);
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� : "+result);
		// sc.close(); <- 8��° ���� sc�� �� ������ �ʾҴٴ� ��� �㶧 �ݾ��ִ� �뵵, �ٵ� �Ƚᵵ ��
			
	}

}

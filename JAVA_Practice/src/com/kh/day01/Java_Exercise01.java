package com.kh.day01;

import java.util.Random;
import java.util.Scanner;

public class Java_Exercise01 {
	public static void main(String [] args) {
//		���ڸ��߱� �����̴�. 
//		1�� 100 ������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������ 
//		����ڰ� ���� �Է��ϸ� ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش� 
//		����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ 
//		�� �� ���� ���ڸ� ������� �˷��ֵ��� ���α׷��� �ۼ��Ͻÿ�.
// 		�ڹ��� ����  4-14 ����
		
// 		��ĳ�ʿ� ����, ī��Ʈ �ʿ� 
		
		Scanner sc = new Scanner(System.in);
		int answer = new Random().nextInt(100)+1; // 100������ ������ ���ڸ� �޴´� 
		
		int count = 0; // ��� ���ȴ��� ī��Ʈ ���ֱ� ���� ���� �������
		System.out.println("===== ���� ���߱� ���� =====");
		
		do {
			count++; // ���� ������ Ƚ�� �����ְ�
			System.out.print("1���� 100������ ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt(); // ���ڸ� �����ش�
			
			if(answer > num) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}else if (answer < num) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else {
				System.out.println("������ϴ�.");
				System.out.println(count+"������ ������ϴ�.");
				break;
			}
	
		} while(true);
	}

}

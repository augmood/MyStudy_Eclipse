package com.kh.control;

public class Exam_Continue {
	public static void main(String [] args ) {
		// 1 ~ 10 ������ �� �� 3�� ����� �����ϰ� ����Ͻÿ�.
		for(int i= 1; i <= 10; i++) {
			// i�� 3�� ����̸� 8��° ���� skip
			System.out.println("����ȣ");
			if(i % 3 ==0) continue; //continue �ؿ� �ִ� �ڵ�� ������ �ȵȴ�.
			System.out.println(i + " ");
		}
	}
}

package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String [] args) {
		// �迭�� �����غ���
		// �ΰ��� ������ �ϳ��� �迭�� ����Ű�� ����
		
		int [] arr1 = new int[4];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		int [] arr2 = arr1;
		arr2[0] = 5; 
		// arr2�� ���簡 �Ǿ��� ������ arr2�� �����ϸ� arr1�� �������� �ʴ´ٰ� ������.
		// but ���� ����� �׷��� ���� �׳� �ٲ� 
		System.out.println("���ص� �Ǵ� : "+arr2[0]+" ���ϸ� �ȵǴ� : "+arr1[0]);	
		
		// ���� ���縦 �غ��ھ��
		int [] arr3 = {1,2,3,4};
		int [] arr4 = new int[4]; // ���� ��ü�� �ٸ��� �Ҵ�
		for (int j = 0; j < arr3.length; j++) {
			arr4[j] = arr3[j]; // ���� �״�� ����
		}
		arr3[0] = 5; 
		// 3�� ���� �ȹٲ� �׷��� 4�� ���� �ּҸ� �����Ѱ� �ƴ϶� ������ ���� ����� �׷��� �ٲ�
		System.out.println("���ص� �Ǵ� : "+arr4[0]+" ���ϸ� �ȵǴ� : "+arr3[0]);	
		
	}
}

package com.kh.array;

public class Exam_SortSelection {
	public static void main(String [] args) {
		/*
		 * ��������
		 * �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		 * Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����
		 *       ������ ���� ������ �ް��� ���� ���ϸ� ����
		 * �迭�� n�� �ε��� ���� n+1�� ~ ������ �ε������� ��
		 */
		
		int [] arrs = {2, 5, 4, 1, 3};
		int min;
		/*
		 * i = 0
		 * 1 5 4 2 3
		 * i = 1
		 * 1 2 4 5 3
		 * i = 2
		 * 1 2 3 5 4
		 * i = 3
		 * 1 2 3 4 5
		 */
		for(int i = 0; i < arrs.length; i++) {
			min = i; // ���� �񱳸� ���� �� �����̴�.
			for(int j = i+1; j < arrs.length; j++) { // �������� ���� �񱳸� �ϰڴ�
				if(arrs[min] > arrs[j]) { // ���� ���� �� ũ��? �׷� �ٲ��ش�
					min = j; 
				}
			}
			int temp = arrs[min]; // ���ڵ��� ���� ������ ��� �ٲ���
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i]+" ");
	}

}
}

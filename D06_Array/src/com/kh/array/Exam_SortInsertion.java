package com.kh.array;

public class Exam_SortInsertion {
	public static void main(String [] args) {
		/*
		 * ���� ����
		 * ���� �˰��� �߿� �ϳ��̸鼭 ���� �����ϰ� �⺻�� �Ǵ� �˰���
		 * �迭�� n�� �ε��� ���� 0��  ~ n-1 �ε������� ��
		 * {2, 5, 4, 1, 3} -> {1, 2, 3, 4, 5}
		 * 
		 * 2 > 5
		 *     5 > 4 -> 4 > 5
		 * 2 > 4 > 5 
		 * 2 > 4 > 5 > 1 -> 2 > 4 > 1 > 5 -> 2 > 1 > 4 > 5 -> 1 > 2 > 4 > 5
		 * 1 > 2 > 4 > 5 > 3 -> 1 > 2 > 4 > 3 > 5 -> 1 > 2 > 3 > 4 > 5 
		 */
		
		int [] arrs = {2, 5, 4, 1, 3};
		for (int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) { // ���� �ΰ��� ���ϱ�
				if (arrs[j-1] > arrs[j]) {
					/*
					 *  i = 2 , j =2 -> for���� 2�� ����
					 *  arrs[1] > arrs[2]
					 *  arrs[0] > arrs[1]
					 */
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				} 
				
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		} 
		
	}

}

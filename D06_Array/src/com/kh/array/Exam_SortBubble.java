package com.kh.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		/* 
		 * ��������
		 * ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		 * ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����
		 * �ٸ� ���Ŀ� ���� ���� �ӵ��� ������, �������� ������ �� ���� ����
		 */
		
		int [] nums = {2, 5, 4, 1, 3};
		
		/*
		 *  2 5 4 1 3 (4) // nums.length-1
		 *  2 4 1 3 5 (3)
		 *  2 1 3 4 5 (2)
		 *  1 2 3 4 5
		 */
		
		for(int i = 0; i<nums.length-1; i++) {
			// (nums.length-1)-i ??? �񱳴��ϴ� ���� ���� �پ��ϱ� i��ŭ ���ֱ�
			for (int j = 0; j <(nums.length-1)-i; j++) {
				if (nums[j] > nums[j+1]) { // ���� ���� �� Ŭ�� �ٲٱ� ����
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		// ����ϴ� �κ�
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}

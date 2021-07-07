package com.kh.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		/* 
		 * 버블정렬
		 * 인접한 두개의 원소를 검사하여 정렬하는 방법
		 * 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		 * 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때 가장 느림
		 */
		
		int [] nums = {2, 5, 4, 1, 3};
		
		/*
		 *  2 5 4 1 3 (4) // nums.length-1
		 *  2 4 1 3 5 (3)
		 *  2 1 3 4 5 (2)
		 *  1 2 3 4 5
		 */
		
		for(int i = 0; i<nums.length-1; i++) {
			// (nums.length-1)-i ??? 비교당하는 수가 점점 줄어드니까 i만큼 빼주기
			for (int j = 0; j <(nums.length-1)-i; j++) {
				if (nums[j] > nums[j+1]) { // 왼쪽 값이 더 클때 바꾸기 시작
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		// 출력하는 부분
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}

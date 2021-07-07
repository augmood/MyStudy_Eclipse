package com.kh.array;

public class Exam_ArraySort {
	public static void main(String [] args) {
		/*
		 * 정렬
		 * 1 3 4 2 5
		 * 오름차순 정렬 -> 1 2 3 4 5
		 * 내림차순 정렬 -> 5 4 3 2 1
		 *
		 */
		
		int num1 = 54;
		int num2 = 22;
		int temp;
		// 둘의 위치를 바꿔주고 싶음.
		// num1 = num2, num2 = num1
		
		// temp라는 빈 공간을 만들어줘야 두 값이 바뀔 수 있음 like 슬라이딩 퍼즐
		temp = num1; // 54, 0
		num1 = num2; // 22, 0
		num2 = temp; // 54, 0
		System.out.println(num1+","+num2);
		System.out.println();
	  
		int [] nums = {2, 1 ,3};
//		int temp1 = nums[0]; // 2,0
//		nums[0] = nums[1]; // 1,0
//		nums[1] = temp1; // 2,0
		
		int temp1 = nums[0]; // 2, 0
		nums[0] = nums[1]; // 1, 0 
		nums[1] = nums[2]; // 3, 0
		nums[2] = temp1; // 2, 0 ---> 1 3 2
		
		for(int i =0; i <nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}

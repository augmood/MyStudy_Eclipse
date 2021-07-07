package com.kh.array;

public class Exam_SortInsertion {
	public static void main(String [] args) {
		/*
		 * 삽입 정렬
		 * 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는 알고리즘
		 * 배열의 n번 인덱스 값을 0번  ~ n-1 인덱스까지 비교
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
			for(int j = i; j > 0; j--) { // 숫자 두개를 비교하기
				if (arrs[j-1] > arrs[j]) {
					/*
					 *  i = 2 , j =2 -> for문이 2번 돈다
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

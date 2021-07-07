package com.kh.control;

public class Exam_ForDouble {
	public static void main(String [] args) {
		//종합 for문
		for(int i = 1; i < 10; i++) { // 얘가 고정값
			// System.out.println(i);
			for(int j = 1; j < 10; j++) { // 얘가 돌아가는 값
				// System.out.print(j+" ");
				// 구구단을 만들어 봅시다.
				System.out.printf("%d * %d = %d \t", i , j, i*j);
				// 이 문장의 i는 첫번째 포문 안에 들어간 중첩 포문이라서 가능함 
			}
			System.out.println();
		}
	}
	

}

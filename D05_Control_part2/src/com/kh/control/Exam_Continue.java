package com.kh.control;

public class Exam_Continue {
	public static void main(String [] args ) {
		// 1 ~ 10 사이의 수 중 3의 배수를 제외하고 출력하시오.
		for(int i= 1; i <= 10; i++) {
			// i가 3의 배수이면 8번째 실행 skip
			System.out.println("무야호");
			if(i % 3 ==0) continue; //continue 밑에 있는 코드는 실행이 안된다.
			System.out.println(i + " ");
		}
	}
}

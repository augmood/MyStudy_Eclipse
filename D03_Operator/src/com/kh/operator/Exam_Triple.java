package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		
		/*
		 * 삼항연산자
		 * 항목이 3개
		 * (조건식) ? 참 , : 거짓
		 * - 조건식은 반드시 T or F
		 * - 비교/논리연산자 주로 사용
		*/
		
		//입력 받은 값으로 판별하기
		Scanner sc = new Scanner(System.in); // -> 스캐너 선언문
		
		System.out.println("값을 입력하세요");
		int input1 = sc.nextInt(); // 값 받기
		String resultStr3 = (input1 % 2) == 0 ? "짝수" : "홀수";
		System.out.println(input1+"은/는 "+resultStr3+"입니다.");
		String resultStr4 = (input1 > 0) ? "양수" : "음수";
		System.out.println(input1+"은/는 "+resultStr4+"입니다.");
		
		// 짝수 홀수 판별
		
		int num = 34;
		// boolean isEven = (num % 2) == 0;
		String resultStr = (num % 2) == 0 ? "짝수" : "홀수"; //-> 삼항연산자
		System.out.println(num+"은/는 "+resultStr+"입니다.");
				
		// 양수 음수 판별
		int input = -4;
		String resultStr2 = (input > 0) ? "양수" : "음수";
		System.out.println(input+"은/는 "+resultStr2+"입니다.");

	}

}

package com.kh.operator;

// import java.util.Scanner;

public class Exam_Comparison {
	public static void main(String [] args) {
		
		//비교 연산자 : 두 값을 비교하는 연산자, 관계 연산자라고 하기도 함
		//조건을 만족하면 T, 아니면 F를 반환함.
		 
		System.out.println("비교 연산자 예제");
		
		int a = 50;
		int b = 30;
				
		boolean result1 = (a < b); // 결과 값을 받아주는 변수
		boolean result2 = (a == b);
		boolean result3 = (a != b);
		
		System.out.println("(a < b) result1 : " + result1);
		System.out.println("(a == b) result2 : " + result1);
		System.out.println("(a != b) result3 : " + result1);
		
		// 산술연산자 (%)와 비교연산자를 함께 쓰는 예제
		// a는 홀수인가? 짝수인가?
		
		boolean isEven = (a%2 == 0);
		System.out.println("a는 짝수 입니까? " + isEven);
		
		
		
	}

}

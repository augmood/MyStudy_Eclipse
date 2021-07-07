package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {
	public static void main(String [] args) {
		
		// 계산기 만들기
		// 두개의 수를 입력 받아서 사칙연산과 나머지 구하기를 하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int second = sc.nextInt();
		
		// 사칙연산,나머지의 결과
		System.out.println("더하기 결과 : " + (first+second));
		System.out.println("빼기 결과 : " + (first-second));
		System.out.println("곱하기 결과 : " + (first*second));
		System.out.println("나누기 결과 : " + (first/second));
		System.out.println("나머지 결과 : " + (first%second));
	}

}
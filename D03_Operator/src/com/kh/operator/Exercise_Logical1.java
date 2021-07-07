package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// 입력한 정수값이 1~100 사이의 숫자인지 확인하시오
	// 정수를 하나 입력해주세요 : 33
	// 1부터 100사이의 숫자인가? : T
	// 정수를 하나 입력해주세요 : 120
	// 1부터 100사이의 숫자인가? : F
	
	System.out.println("정수를 하나 입력해주세요.");
	int num1 = sc.nextInt();
	//boolean result1, result2;
	boolean isTrue = (1 <= num1) && (num1 <= 100);
	// result1 = (1 <= num1) && (num1 <= 100);
	System.out.println("1부터 100사이의 숫자인가? "+isTrue);
	
	}
}

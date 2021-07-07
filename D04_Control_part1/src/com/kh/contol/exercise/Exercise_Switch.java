package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	
//	public void exercise1() {
		// 1-3 사이의 정수를 입력받아
		// 1인 경우 빨간색 입니다.
		// 2인 경우 파란색 입니다.
		// 3인 경우 초록색 입니다.
		// 그 외의 정수를 입력 할 경우 잘못 입력하셨습니다를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력해주세요 : ");
//		int num1 = sc.nextInt();
//		
//		switch(num1)
//		{
//		case 1 :
//			System.out.println("빨간색 입니다.");
//			break;
//		case 2:
//			System.out.println("파란색 입니다.");
//			break;
//		case 3:
//			System.out.println("초록색 입니다.");
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//	}
	
//	public void exercise2() {
//		
//		 /* 정수 두개와 연산기호 문자 1개를 입력받아서
//		 * 연산기호문자(+ - *,/)에 해당하는 계산을 수행하고 출력하세요
//		 * 단, 그 외의 문자를 입력할 경우 연산자를 잘못입력하셨습니다를 출력하세요.
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수를 입력해주세요 : ");
//		int input1 = sc.nextInt();
//		System.out.print("두번째 정수를 입력해주세요 : ");
//		int input2 = sc.nextInt();
//		System.out.print("연산기호 문자를 입력해주세요 : ");
//		char ch = sc.next().charAt(0);
//		int result = 0; // 0의 result를 선언하고 여기에 계산값을 받아줌
//		switch (ch)
//		{
//		
//		//System.out~ 출력문을 한번만 쓸수는 없을까?
//		
//		case '+' :
//			result = (input1+input2); 
//		break;
//		case '-' :
//			result = (input1-input2);
//		break;
//		case '*' :
//			result = (input1*input2);
//		break;
//		case '/' :
//			result = (input1/input2);
//		break;
//		default :
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		System.out.println("결과 값 : "+result);
//	}
	
	public void exercise3() {
		/*
		 * 1-12 사이의 숫자를 입력받아 해당하는 숫자 달의 마지막 날짜를 출력하세요.
		 * 그 외의 숫자를 입력할 경우 1-12 사이의 숫자를 입력하세요를 출력하세요.
		 * 
		 * 1월 - 12월까지 중 하나를 입력하세요 : 3;
		 * 입력하신 월은 31일 까지 입니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월 중 하나를 입력해주세요 : ");
		int inputMonth = sc.nextInt();
		
		
		switch (inputMonth) 
		{
		case 1: //31 
		case 3 : //31
		case 5 : //31
		case 7 : //31
		case 8 : //31
		case 10 : //31
		case 12 : //31 -> 같은걸 모아두고 브레이크를 지우면 같은것만 쭉 계산해서 출력함 !
			System.out.println("입력하신 월은 31일 까지 입니다.");
		break;
		
		case 2: //28, 29
			System.out.println("입력하신 월은 28일 or 29일 까지 입니다.");
		break;

		case 4 : //30
		case 6 : //30
		case 9 : //30
		case 11 : //30
			System.out.println("입력하신 월은 30일 까지 입니다.");
		break;
		
		default :
		System.out.println("1-12 사이의 숫자를 입력하세요를 출력하세요.");
		}
	}	
}
	

package com.kh.control;

import java.util.Scanner;

public class Exam_if1 {
	public static void main(String [] args) {
		// 정수하나 입력헤주세요 : 44
		// 양수입니다.
		
		// 정수하나 입력해주세요 : -1 
		// 음수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
			
		if (num1 > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.print("음수입니다.");
		}

		System.out.println();

//		if (num1 < 0) {
//			System.out.println("음수입니다.");
//		}
		
		// 입력받은 정수가 양수, 0, 음수인지 판별하시오.
		// if문 3개를 쓰면 3개 모두 동작을 하지만
		// else if를 쓰면 else if가 참일 때 else는 동작안함.
		// 입력한 값이 0일 때 차이를 보여줌. 
		if (num1 > 0) {
			System.out.println("양수입니다.");
		} 
		// -> 0이 음수에 포함되지 않게 함 
		else if (num1 == 0){
			System.out.println("0 입니다."); 
		}
		// 이렇게만 쓰면 0인 경우도 포함됨
		else {
			System.out.println("음수입니다.");
		}
//		if (num1 == 0) {
//			System.out.print("0 입니다.");
//		}
//		if (num1 < 0 ) {
//			System.out.println("음수 입니다.");
//		}

	}

}












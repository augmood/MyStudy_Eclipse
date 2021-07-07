package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		//입력한 문자 값이 대문자인지 확인하여 결과 출력하기
		// 문자 하나 입력해 주세요 : a
		// 영어 대문자 확인 : F
		// 문자 하나 입력해주세요 : A
		// 영어 대문자 확인 : T

		System.out.println("문자 하나 입력해주세요");
		char ch = sc.next().charAt(0);
		boolean check = (ch >= 'A') && (ch <= 'Z'); // -> 여길 몰랐음
		System.out.println("숫자 하나 입력해주세요");
		int input = sc.nextInt();
		System.out.println("문자로 변환 : "+(char)input);
		
		// -> 대문자를 어케 해야할지 모르것어서 답안 참고함
		// 아스키 코드표 기준으로 대문자를 판별합니다. (각각 고유한 숫자가 있어서 이렇게 판별합니다)
		System.out.println("영어 대문자 확인 "+ check);
		
	}

}

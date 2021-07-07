package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	public static void main(String [] args) {
		// break문은 가장 가까운 반복문을 빠져나가는 구문
		// for 문이 중첩으로 퇴어 있을 때 빠져나오게 하려면 break 2개 필요
		
		// 문자열을 입력받아 글자 개수를 출력하는 프로그램
		// "end"가 입력되면 반복을 종료함.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			// 1. 문자열의 비교는 어떻게 할 것 인가? equals (str만 사용 ok)
			if(str.equals("end")) break; // == 이러면 안됨, 문장 길면 {} 가두고 브레이크 
			// 2. 문자열의 길이, 갯수는 어떻게 출력하는 것인가? length() / 
			str.length();
			System.out.println("글자 갯수 : "+str.length());
		}

	}

}

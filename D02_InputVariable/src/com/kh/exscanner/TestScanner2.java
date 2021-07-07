package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	
		// 정수를 입력해주세요
		System.out.println("정수를 입력헤주세요.");
		int iNum = sc.nextInt();
		// 실수를 입력해주세요
		System.out.println("실수를 입력해주세요.");
		double dNum = sc.nextDouble();
		// 문자를 입력해주세요
		System.out.println("문자를 입력해주세요.");
		// Scanner에는 문자만 입력받는 기능이 없어서 문자열을 입력받은 후 잘라서 문자에다가 저장함.
		char ch = sc.next().charAt(0); // 한글자만 잘라서 받겠다.
		// 문자열을 입력해주세요
		System.out.println("문자열을 입력해주세요.");
		String str = sc.next();
	
		
		
		// 입력한 정수는 :
		System.out.println("입력한 정수는 : "+iNum);
		// 입력한 실수는 :
		System.out.println("입력한 실수는 : "+dNum);
		// 입력한 문자는 :
		System.out.println("입력한 문자는 : "+ch);
		// 입력한 문자열은 :
		System.out.println("입력한 문자열은 : "+str);
	}

}

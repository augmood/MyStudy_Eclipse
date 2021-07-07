package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 이름을 입력해주세요
		System.out.print("이름을 입력해주세요");
		String name = sc.next();

		// 태어난 월
		System.out.print("태어난 월을 입력해주세요");
		int birthMonth = sc.nextInt();

		// 주소를 입력해주세요
		System.out.println("주소를 입력해주세요");
		sc.nextLine(); // 주소값을 입력받는 창보다 위에 써야 함 -> 방어개념
		String address = sc.nextLine();

		// 키를 입력해주세요 -> 정수변환
		System.out.println("키를 입력해주세요");
		double height = sc.nextDouble();

		// 몸무게를 입력해주세요 -> 소수점 첫번째 자리
		System.out.println("몸무게를 입력해주세요");
		double weight = sc.nextDouble();

		// 성별을 입력해주세요
		System.out.println("성별을 입력해주세요");
		char gender = sc.next().charAt(0);

		// 출력 창
		// System.out.println("제 이름은 "+name+"입니다.");
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("태어난 월은 %d월 입니다.\n", birthMonth);
		System.out.printf("주소는 %s 입니다.\n", address);
//		System.out.println("키는 "+(int)height+"입니다."); //강제형변환
		System.out.printf("키는 %d 입니다.\n", (int)height);
		System.out.printf("제 몸무게는 %.1f 입니다.\n", weight); // 소수점 첫번째 자리
//		System.out.println("성별은 "+gender+"자 입니다.");
		System.out.printf("성별은 %c자 입니다.", gender);

	}

}

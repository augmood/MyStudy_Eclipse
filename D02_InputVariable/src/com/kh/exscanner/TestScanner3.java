package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//이름을 입력하세요
		System.out.println("이름을 입력하세요");
		String na = sc.next();
		//태어난 월을 입력하세요
		System.out.println("태어난 월을 입력하세요");
		int bir = sc.nextInt();
		//키를 입력하세요
		System.out.println("키를 입력하세요");
		double he = sc.nextDouble();
		//성별을 입력하세요
		System.out.println("성별을 입력하세요");
		char gen = sc.next().charAt(0);
		//주소를 입력하세요
		System.out.println("주소를 입력하세요");
		sc.nextLine();
		String add = sc.nextLine();
		//next()는 공백을 받지 못함, nextLine()은 공백을 받을 수 있음
		
		//이름은 홍길동 입니다.
		System.out.println("이름은 "+na+"입니다.");
		//태어난 월은 6월 입니다.
		System.out.println("태어난 월은 "+bir+"월입니다.");
		//키는 185.2입니다.
     	System.out.println("키는 "+he+"입니다.");
		//성별은 남자입니다.
     	System.out.println("성별은 "+gen+"자입니다.");
		//주소는 서울시 종로구 입니다.
        System.out.println("주소는 "+add+" 입니다.");
	}

}

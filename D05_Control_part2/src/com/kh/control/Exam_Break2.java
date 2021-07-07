package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		종료 : // -> while 무한루프 밖에다가 종료하면 break 문을 걸어서 밖으로 나오게
		while(true) {
		System.out.println("정수를 입력해주세요");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 0:
			System.out.println("종료합니다.");
			break 종료; // ---> 종료시 while 밖으로 빠져나오게
		default :
			System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}
}



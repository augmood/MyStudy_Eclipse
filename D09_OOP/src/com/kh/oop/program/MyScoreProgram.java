package com.kh.oop.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String[] args) {

		/*
		 * ===== 메인 메뉴 ===== 
		 * 1. 성적입력 
		 * 2. 성적출력 
		 * 3. 종료 선택 : 1
		 * 
		 * ===== 성적 입력 ===== 
		 * 국어 : 50 
		 * 영어 : 40 
		 * 수학 : 30
		 * 
		 * ===== 메인 메뉴 ===== 
		 * 1. 성적입력 
		 * 2. 성적출력 
		 * 3. 종료 선택 : 2
		 * 
		 * ===== 성적 출력 ===== 
		 * 국어 : 50 
		 * 영어 : 40
		 *  수학 : 30
		 * 
		 * 총점 : 120 평균 : 40.00
		 * 
		 * ===== 메인 메뉴 ===== 
		 * 1. 성적입력 
		 * 2. 성적출력 
		 * 3. 종료 선택 : 3
		 * 
		 * G O O D B Y E - !
		 * 
		 */

		/*
		 * 1. 스캐너를 쓴다 (값을 받아야 한다. -> 값을 받는건 두개가 필요 선택 번호와 점수) 
		 * 2. 메뉴를 선택하면 각자의 결과물을 보여준다.
		 * (switch case문 ) 
		 * 3. 다시 그 메뉴가 나오게 한다. 
		 * 4. 종료를 누르면 break 메세지가 뜨게 한다.
		 */
		Scanner sc = new Scanner(System.in);
		int[] kors = new int[3]; // 이건 밑의 함수에 따로 쓰면 X kors 라는 배열을 계속 호출해야함
		int total = 0;
		float avg = 0;

		EXIT: while (true) {
			int choice = showMenu();
			switch (choice) {
			case 1:
				System.out.println("===== 성적 입력 =====");
				insertScore(kors);
				break;
			case 2:
				System.out.println("===== 성적 출력 =====");
				printScore(kors, total, avg);
				break;
			case 3:
				System.out.println("G O O D - B Y E");
				break EXIT;
			default:
				System.out.print("1~3 사이의 수를 입력헤주세요");
			}
		}
	}

	////////////////////////////// 함수 //////////////////////////////////////
	// showMenu 메소드는 메뉴를 출력하고 값을 입력받아 반환해야함.
	// ctrl+shft+-
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	static void insertScore(int[] kors) { // 반환형을 뭘로 받을지 잘 생각을 해보세요. 값을 받는지 안 받는지.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < kors.length; i++) {
			do {
				System.out.println("학생 " + (i + 1) + "의 성적 :  ");
				kors[i] = sc.nextInt();
				if (kors[i] < 0 || kors[i] > 100) {
					System.out.println("다시 입력해주세요");
				}
			} while (kors[i] < 0 || kors[i] > 100);
		}
	}

	static void printScore(int[] kors, int total, float avg) {
		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
			System.out.println("학생 " + (i + 1) + "의 성적 :  " + kors[i]);
		}
		avg = total / kors.length;
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.1f \n", avg);
	}
}

package com.kh.oop;

import java.util.Scanner;

public class StudentList {

	// int [] kors = new int[3]; -> 이렇게 써도 가능
	int[] kors;
	int total;
	float avg;

	public StudentList() {
		kors = new int[3];
		total = 0;
		avg = 0;
	} // 기본생성자

	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 메인 메뉴 ========");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		return sc.nextInt();

	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < kors.length; i++) {
			do {
				System.out.print("학생 " + (i + 1) + "의 국어성적 : ");
				kors[i] = sc.nextInt();
				if (kors[i] < 0 || kors[i] > 100) {
					System.out.println("다시 입력해주세요");
				}
			} while (kors[i] < 0 || kors[i] > 100);
		}

	}
	
	public void printScore() {
		for (int i = 0; i < kors.length; i++) {
		total = kors[i];
		System.out.println("학생"+(i+1)+"의 성적 : "+kors[i]);
		}
		avg = total / kors.length;
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.1f \n", avg);
	}
}

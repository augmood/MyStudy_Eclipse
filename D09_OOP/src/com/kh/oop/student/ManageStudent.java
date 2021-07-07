package com.kh.oop.student;

import java.util.Scanner;


// 데이터 입출력용
public class ManageStudent {
	
	Student student;

	public ManageStudent() {
		student = new Student();

	}

	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 성적 관리 프로그램 ========");
		System.out.println("1. 학생 성적입력");
		System.out.println("2. 학생 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 정보 입력 ========");
		System.out.print("학생 이름을 입력하세요 : ");
		String studentName = sc.next(); // 저장
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		student.setName(studentName);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		
	}
	
	public void printScore() {
		System.out.println("======== 입력한 학생의 성적 ========");
		String studentName = student.getName();
		int kor = student.getKor();
		int eng = student.getEng();
		int math = student.getMath();
		System.out.println(studentName+"학생의 성적");
		System.out.println("학생의 국어 성적 " + kor);
		System.out.println("학생의 영어 성적 " + eng);
		System.out.println("학생의 수학 성적 " + math);
		System.out.println("학생의 점수 총합 " + student.total());
	

	}

}

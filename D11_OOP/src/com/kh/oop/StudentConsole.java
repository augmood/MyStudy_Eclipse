package com.kh.oop;

import java.util.Scanner;

public class StudentConsole {
	
	// 데이터 출력 및 저장 
	StudentList sList; //리스트에 값을 가져다 써야하니까
	
	public StudentConsole() {
		sList = new StudentList();
	}
	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 관리 프로그램 =====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 정보 입력 ========");
		Student [] students = new Student[3];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println((i+1)+"번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next(); // 저장
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			int math = sc.nextInt();
			
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		}
		///////////////////////////////
		sList.setStudent(students); // 
		////////////////////////////// 이거 없으면 동작이 안됨
	}
	
	public void printScore() {
		Student [] students = sList.getStudents(); // 여기 값을
		System.out.println("====== 입력한 학생의 성적 ======");
		
		for(int i = 0;  i < students.length; i++) {
			
			// 우리는 여기서 값을 꺼낼겁니다. (get이 여기서 사용하라고 있는 것임 호출해줘)
			String name = students[i].getName();
			int kor = students[i].getKor();
			int eng = students[i].getEng();
			int math = students[i].getMath();
			int total = students[i].total();
			double avg = students[i].avg();
			
			System.out.println(name+"학생의 성적");
			System.out.println("학생의 국어 성적 : " + kor);
			System.out.println("학생의 영어 성적 : " + eng);
			System.out.println("학생의 수학 성적 : " + math);
			System.out.printf("학생의 점수 평균  : %.2f \n ", avg);
		
		}
		
	}
	
	

}

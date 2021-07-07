package com.kh.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 데이터 입출력용 (student 에서 저장한 값을 쓸거야)
public class ManageStudent {
	
	// 09 OOP는 한명의 것만 받고 이번엔 세명의 값을 받는다.
	List<Student> students;

	//멤버 변수, 초기화, 생성자
	public ManageStudent() {
		students = new ArrayList<Student>();

	}
	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 관리 프로그램 =====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 정보 입력 ========");
		// 데이터를 담는 공간은 student 
		// student를 담는 공간이 students
		for(int i = 0; i < students.length; i++) {
			// 배열에 학생들의 값을 저장해줄겁니다.
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
		
			// students 배열 안에 있는 학생들의 정보 값을 받을 겁니다.
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		
		}
	}
	
	public void printScore() {
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
			System.out.println("학생의 점수 총합 : " + total);
			System.out.printf("학생의 점수 평균  : %.2f \n ", avg);
		
		}

	}

}

package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	
	private Scanner sc; 
	private StudentController stdController;
	
	
	// 여기서 스캐너를 설정하면 메뉴마다 일일히 스캐너를 불러오지 않아도 된다.
	// 변수 sc로 스캐너 사용 가능함.
	public StudentView() {
		sc = new Scanner(System.in);
		stdController = new StudentController();
	}
	/*
	 * MainMewnu()
	 * 	========== 학생 성적 관리 프로그램 ==========
	 * 1. 학생 전체 정보 출력
	 * 2. 학생 정보 조회(학번)
	 * 3. 학생 정보 입력
	 * 4. 학생 정보 변경
	 * 5. 학생 정보 삭제
	 * 9. 프로그램 종료
	 * 선택 : 
	 */
	
	public int mainMenu() {
		// Scanner sc = new Scanner(System.in);
		System.out.println("========== 학생 성적 관리 프로그램 ==========");
		System.out.println("1. 학생 전체 정보 출력");
		System.out.println("2. 학생 정보 조회(학번)");
		System.out.println("3. 학생 정보 입력");
		System.out.println("4. 학생 정보 변경");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("9. 프로그램 종료");
		System.out.println("선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public void insertStudent() {
		Student student = new Student();
		System.out.println("학번 : ");
		int classNumber = sc.nextInt();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("주소 : ");
		String address = sc.nextLine();
		System.out.println("학점 : ");
		Double grade = sc.nextDouble();
		
		// 저장
		student.setClassNumber(classNumber);
		student.setName(name);
		student.setAge(age);
		student.setAddress(address);
		student.setGrade(grade);
		
		// 저장한걸 전부  addStudent에 넘겨줌
		stdController.addStudent(student);
	}
	
	public void printAll () {
		// 값 저장소, 1개 또는 여러개 존재 할 수 있음
		ArrayList<Student> list = stdController.selectAll();
		System.out.println("========= 전체 학생 출력 =========");
		//저장소에 1개 이상 있는가? 
		if(!list.isEmpty()) {
			// 저장된 수 만큼 돌린다
			for(int i = 0; i < list.size(); i++) {
				// 한개의 값을 꺼낸다.
				Student std = list.get(i);
				// 값을 출력한다.
				System.out.println(std.toString());
			}
		}
		
	}
	
	public void printOne( ) {
		System.out.println("조회 할 학생 학번 입력 : ");
		int searchNum = sc.nextInt();
		Student searchOne = stdController.selectOne(searchNum);
		if(searchOne != null) {
			System.out.println("========== 학번 조회 결과 출력 ===========");
			System.out.println(searchOne.toString());
		}else {
			System.out.println("조회 된 결과가 없습니다.");
		}
		
		
	}
	
	public void modifyOne() {
		System.out.println("=========== 학생 정보 변경 =========== ");
		System.out.print("이름 입력 : ");
		String studentName = sc.next();
		sc.nextLine();
		Student isStudent = stdController.selectOne(studentName);
		if(isStudent != null) {
			// 수정 내용을 입력하기
			System.out.print("수정할 주소 입력 : ");
			String address = sc.nextLine();
			System.out.print("수정할 합점 입력 : ");
			double grade = sc.nextDouble();
			
			isStudent.setAddress(address); 
			isStudent.setGrade(grade);
			
			stdController.updateStudent(isStudent);
			System.out.println("수정완료");
		}else {
			System.out.println("일치하는 학생이 없습니다.");
		}
		
	}
	
	
	public void deleteStudent() {
		System.out.println("========== 학생 정보 삭제 ==========");
		System.out.print("삭제 할 이름 입력 : ");
		String studentName = sc.next();
		boolean isSuccess = stdController.deleteStudent(studentName);
		if(isSuccess) {
			System.out.println("삭제 성공하였습니다.");
		}else {
			System.out.println("삭제 실패하였습니다.");
		}
	

	}

}

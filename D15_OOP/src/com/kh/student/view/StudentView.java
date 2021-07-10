package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	
	private Scanner sc; 
	private StudentController stdController;
	
	
	// ���⼭ ��ĳ�ʸ� �����ϸ� �޴����� ������ ��ĳ�ʸ� �ҷ����� �ʾƵ� �ȴ�.
	// ���� sc�� ��ĳ�� ��� ������.
	public StudentView() {
		sc = new Scanner(System.in);
		stdController = new StudentController();
	}
	/*
	 * MainMewnu()
	 * 	========== �л� ���� ���� ���α׷� ==========
	 * 1. �л� ��ü ���� ���
	 * 2. �л� ���� ��ȸ(�й�)
	 * 3. �л� ���� �Է�
	 * 4. �л� ���� ����
	 * 5. �л� ���� ����
	 * 9. ���α׷� ����
	 * ���� : 
	 */
	
	public int mainMenu() {
		// Scanner sc = new Scanner(System.in);
		System.out.println("========== �л� ���� ���� ���α׷� ==========");
		System.out.println("1. �л� ��ü ���� ���");
		System.out.println("2. �л� ���� ��ȸ(�й�)");
		System.out.println("3. �л� ���� �Է�");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ����");
		System.out.println("9. ���α׷� ����");
		System.out.println("���� : ");
		int input = sc.nextInt();
		return input;
	}
	
	public void insertStudent() {
		Student student = new Student();
		System.out.println("�й� : ");
		int classNumber = sc.nextInt();
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("�ּ� : ");
		String address = sc.nextLine();
		System.out.println("���� : ");
		Double grade = sc.nextDouble();
		
		// ����
		student.setClassNumber(classNumber);
		student.setName(name);
		student.setAge(age);
		student.setAddress(address);
		student.setGrade(grade);
		
		// �����Ѱ� ����  addStudent�� �Ѱ���
		stdController.addStudent(student);
	}
	
	public void printAll () {
		// �� �����, 1�� �Ǵ� ������ ���� �� �� ����
		ArrayList<Student> list = stdController.selectAll();
		System.out.println("========= ��ü �л� ��� =========");
		//����ҿ� 1�� �̻� �ִ°�? 
		if(!list.isEmpty()) {
			// ����� �� ��ŭ ������
			for(int i = 0; i < list.size(); i++) {
				// �Ѱ��� ���� ������.
				Student std = list.get(i);
				// ���� ����Ѵ�.
				System.out.println(std.toString());
			}
		}
		
	}
	
	public void printOne( ) {
		System.out.println("��ȸ �� �л� �й� �Է� : ");
		int searchNum = sc.nextInt();
		Student searchOne = stdController.selectOne(searchNum);
		if(searchOne != null) {
			System.out.println("========== �й� ��ȸ ��� ��� ===========");
			System.out.println(searchOne.toString());
		}else {
			System.out.println("��ȸ �� ����� �����ϴ�.");
		}
		
		
	}
	
	public void modifyOne() {
		System.out.println("=========== �л� ���� ���� =========== ");
		System.out.print("�̸� �Է� : ");
		String studentName = sc.next();
		sc.nextLine();
		Student isStudent = stdController.selectOne(studentName);
		if(isStudent != null) {
			// ���� ������ �Է��ϱ�
			System.out.print("������ �ּ� �Է� : ");
			String address = sc.nextLine();
			System.out.print("������ ���� �Է� : ");
			double grade = sc.nextDouble();
			
			isStudent.setAddress(address); 
			isStudent.setGrade(grade);
			
			stdController.updateStudent(isStudent);
			System.out.println("�����Ϸ�");
		}else {
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		}
		
	}
	
	
	public void deleteStudent() {
		System.out.println("========== �л� ���� ���� ==========");
		System.out.print("���� �� �̸� �Է� : ");
		String studentName = sc.next();
		boolean isSuccess = stdController.deleteStudent(studentName);
		if(isSuccess) {
			System.out.println("���� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���� �����Ͽ����ϴ�.");
		}
	

	}

}

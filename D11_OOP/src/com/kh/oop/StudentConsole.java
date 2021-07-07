package com.kh.oop;

import java.util.Scanner;

public class StudentConsole {
	
	// ������ ��� �� ���� 
	StudentList sList; //����Ʈ�� ���� ������ ����ϴϱ�
	
	public StudentConsole() {
		sList = new StudentList();
	}
	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �л� ���� ���� ���α׷� =====");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �л� ���� �Է� ========");
		Student [] students = new Student[3];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println((i+1)+"��° �л� ���� �Է�");
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next(); // ����
			System.out.print("���� ���� �Է� : ");
			int kor = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
			int eng = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
			int math = sc.nextInt();
			
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		}
		///////////////////////////////
		sList.setStudent(students); // 
		////////////////////////////// �̰� ������ ������ �ȵ�
	}
	
	public void printScore() {
		Student [] students = sList.getStudents(); // ���� ����
		System.out.println("====== �Է��� �л��� ���� ======");
		
		for(int i = 0;  i < students.length; i++) {
			
			// �츮�� ���⼭ ���� �����̴ϴ�. (get�� ���⼭ ����϶�� �ִ� ���� ȣ������)
			String name = students[i].getName();
			int kor = students[i].getKor();
			int eng = students[i].getEng();
			int math = students[i].getMath();
			int total = students[i].total();
			double avg = students[i].avg();
			
			System.out.println(name+"�л��� ����");
			System.out.println("�л��� ���� ���� : " + kor);
			System.out.println("�л��� ���� ���� : " + eng);
			System.out.println("�л��� ���� ���� : " + math);
			System.out.printf("�л��� ���� ���  : %.2f \n ", avg);
		
		}
		
	}
	
	

}

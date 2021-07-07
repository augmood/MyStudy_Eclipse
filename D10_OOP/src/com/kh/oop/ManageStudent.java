package com.kh.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// ������ ����¿� (student ���� ������ ���� ���ž�)
public class ManageStudent {
	
	// 09 OOP�� �Ѹ��� �͸� �ް� �̹��� ������ ���� �޴´�.
	List<Student> students;

	//��� ����, �ʱ�ȭ, ������
	public ManageStudent() {
		students = new ArrayList<Student>();

	}
	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �л� ���� ���� ���α׷� =====");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}
	
	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �л� ���� �Է� ========");
		// �����͸� ��� ������ student 
		// student�� ��� ������ students
		for(int i = 0; i < students.length; i++) {
			// �迭�� �л����� ���� �������̴ٰϴ�.
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
		
			// students �迭 �ȿ� �ִ� �л����� ���� ���� ���� �̴ϴ�.
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		
		}
	}
	
	public void printScore() {
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
			System.out.println("�л��� ���� ���� : " + total);
			System.out.printf("�л��� ���� ���  : %.2f \n ", avg);
		
		}

	}

}

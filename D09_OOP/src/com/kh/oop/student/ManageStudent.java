package com.kh.oop.student;

import java.util.Scanner;


// ������ ����¿�
public class ManageStudent {
	
	Student student;

	public ManageStudent() {
		student = new Student();

	}

	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �л� ���� ���� ���α׷� ========");
		System.out.println("1. �л� �����Է�");
		System.out.println("2. �л� �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}
	
	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �л� ���� �Է� ========");
		System.out.print("�л� �̸��� �Է��ϼ��� : ");
		String studentName = sc.next(); // ����
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		
		student.setName(studentName);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		
	}
	
	public void printScore() {
		System.out.println("======== �Է��� �л��� ���� ========");
		String studentName = student.getName();
		int kor = student.getKor();
		int eng = student.getEng();
		int math = student.getMath();
		System.out.println(studentName+"�л��� ����");
		System.out.println("�л��� ���� ���� " + kor);
		System.out.println("�л��� ���� ���� " + eng);
		System.out.println("�л��� ���� ���� " + math);
		System.out.println("�л��� ���� ���� " + student.total());
	

	}

}

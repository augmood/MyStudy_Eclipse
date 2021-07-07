package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private PersonController pc;
	
	public PersonMenu() {
		sc = new Scanner(System.in); 
		pc= new PersonController();
	}
	
	public void mainMenu() {
		/*
		 * �л��� �ִ� 3����� ������ �� �ֽ��ϴ�.
		 * ���� ����� �л��� M�� �Դϴ�.
		 * ����� �ִ� 10����� ������ �� �ֽ��ϴ�.
		 * ���� ����� ����� N�� �Դϴ�.
		 * M�� N�� ���� ���ڴ� PersonCollector Ŭ������ �ִ�
		 * PersonCount() �޼ҵ��� ��ȯ���� �̿��Ͽ� ���.
		 * 
		 * 1. �л��޴�
		 * 2. ����޴�
		 * 9. ������  "�����Ͽ����ϴ�." ����� ����
		 * �޴���ȣ : �߸� �Է����� ��� "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���" ��� �� �ݺ� 
		 */
		
		int menu = 0;
		
		do {
			int [] counts = pc.personCount();
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� "+counts[0]+"�� �Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� "+counts[0]+"���Դϴ�.");
			
			System.out.println("1.�л� �޴�");
			System.out.println("2.��� �޴�");
			System.out.println("9.������");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}while (menu != 9);
		
	}
	
	public void studentMenu() {
		
		end :
		while (true) {
		
		System.out.println("1.�л� �߰� ");
		System.out.println("2.�л� ���� ");
		System.out.println("9.�������� ");
		System.out.print("�޴���ȣ : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			if (pc.personCount()[0] != 3) {
			insertStudent();
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			break;
		case 2 :
			printStudent();
			break;
		case 9 :
			break end;
			}
		
		}
	}
	
	public void employeeMenu() {
		
	}
	
	public void insertStudent() {
		
		while(true) {
		int [] counts = pc.personCount();
		System.out.print("�л� �̸�  : ");
		String name = sc.next();
		System.out.print("�л� ����  : ");
		int age = sc.nextInt();
		System.out.print("�л� Ű  : ");
		Double height = sc.nextDouble();
		System.out.print("�л� ������  : ");
		Double weight = sc.nextDouble();
		System.out.print("�л� �г�  : ");
		int grade = sc.nextInt();
		System.out.print("�л� ����  : ");
		String major = sc.next();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		if(counts[0] < 2) {
			System.out.println("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
			char goYn = sc.next().charAt(0);
			if(goYn == 'N' || goYn == 'n' ) {
				break;
			}else {
				continue;
				}
			} else {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				break;
			}
		}
		
	}
	
	public void printStudent() {
		Student [] stds = pc.printStudent();
		int [] counts = pc.personCount();
		for (int i = 0; i < pc.personCount()[0]; i++){
			System.out.printf("%s , %d , %.1f , %.1f , %d , %s \n", 
					stds[i].getName(),stds[i].getAge(),stds[i].getHeight(),
					stds[i].getWeight(),stds[i].getGrade(),stds[i].getMajor());
		}
		
	}
	
	public void insertEmployee() {
		
		System.out.print("���� �̸�  : ");
		String name = sc.next();
		System.out.print("���� ����  : ");
		int age = sc.nextInt();
		System.out.print("���� Ű  : ");
		Double height = sc.nextDouble();
		System.out.print("���� ������  : ");
		Double weight = sc.nextDouble();
		System.out.print("���� ����  : ");
		int salary = sc.nextInt();
		System.out.print("���� �μ�  : ");
		String dept = sc.next();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
	}
	
	public void printEmployee() {
		
	}

}

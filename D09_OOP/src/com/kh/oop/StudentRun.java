package com.kh.oop;

public class StudentRun {
	public static void main(String [] args) {
		
		// ��ü ���� �� �޼ҵ� ȣ��
		int [] kors = new int[3];
		StudentList stdList = new StudentList();
		
		EXIT :
		while (true) {
			int choice = stdList.showMenu();
			switch (choice) {
			case 1:
				// �����Է�
				stdList.insertScore();
				break;
			case 2:
				// �������
				stdList.printScore();
				break;
			case 3:
				// ����
				break EXIT;
			default:
				System.out.println("1-3 ������ ���� �Է����ּ���.");
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

}

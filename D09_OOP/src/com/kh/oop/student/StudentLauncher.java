package com.kh.oop.student;


// ������ �����
public class StudentLauncher {
	public static void main(String [] ars ) {
		
		ManageStudent mstd = new ManageStudent();
		
		EXIT : 
			while (true) {
				int choice = mstd.showMenu();
				switch (choice) {
				case 1:
					mstd.insertScore();
					break;
				case 2:
					mstd.printScore();
					break;
				case 3:
					break EXIT;
				default :
					System.out.println("1-3 ������ ���� �Է����ּ���");
					}
				}
				System.out.println("����Ǿ����ϴ�.");
		
	}
}

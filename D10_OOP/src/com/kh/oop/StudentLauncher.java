package com.kh.oop;


// ������ �����
public class StudentLauncher {
	public static void main(String [] ars ) {
		
		// �̰� ���Ŷ�� ��ü�� �������ش�. 
		ManageStudent mstd = new ManageStudent();
		
		EXIT : 
			while (true) { // �޴��� ����Ұž� 
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
				System.out.println("G O O D B Y E !");
		
	}
}

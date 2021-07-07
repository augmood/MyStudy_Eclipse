package com.kh.oop.student;


// 데이터 실행용
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
					System.out.println("1-3 사이의 수를 입력해주세요");
					}
				}
				System.out.println("종료되었습니다.");
		
	}
}

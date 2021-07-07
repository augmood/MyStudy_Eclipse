package com.kh.oop;


// 데이터 실행용
public class StudentLauncher {
	public static void main(String [] ars ) {
		
		// 이거 쓸거라고 객체를 생성해준다. 
		ManageStudent mstd = new ManageStudent();
		
		EXIT : 
			while (true) { // 메뉴를 출력할거야 
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
				System.out.println("G O O D B Y E !");
		
	}
}

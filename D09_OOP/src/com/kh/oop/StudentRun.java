package com.kh.oop;

public class StudentRun {
	public static void main(String [] args) {
		
		// 객체 생성 후 메소드 호출
		int [] kors = new int[3];
		StudentList stdList = new StudentList();
		
		EXIT :
		while (true) {
			int choice = stdList.showMenu();
			switch (choice) {
			case 1:
				// 성적입력
				stdList.insertScore();
				break;
			case 2:
				// 성적출력
				stdList.printScore();
				break;
			case 3:
				// 종료
				break EXIT;
			default:
				System.out.println("1-3 사이의 수를 입력해주세요.");
			}
		}
		System.out.println("종료되었습니다.");
	}

}

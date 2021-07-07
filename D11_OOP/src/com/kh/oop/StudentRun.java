package com.kh.oop;

public class StudentRun {
	public static void main(String [] args) {
		
		// 실행용 클래스
		StudentConsole console = new StudentConsole();
		
		END : 
		while(true) {
			int choice = console.showMenu();
			switch(choice) {
			case 1 :
				console.insertScore();
				break;
			case 2 :
				console.printScore();
				break;
			case 3 :
				break END;
				default:
					System.out.println("1-3사이의 숫자를 입력해주세요 ");
			}
		}
		
		System.out.println("종료되었습니다.");
	}

}

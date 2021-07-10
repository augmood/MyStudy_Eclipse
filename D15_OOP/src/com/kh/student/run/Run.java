package com.kh.student.run;

import com.kh.student.view.StudentView;

public class Run {
	public static void main(String [] args) {
		
		//studentview의 메소드를 가져다 쓴다.
		StudentView view = new StudentView();
		
		end : 
		do 
		{
			int choice = view.mainMenu();
			switch(choice) {
			case 1:
				view.printAll();
				break;
			case 2:
				view.printOne();
				break;
			case 3:
				view.insertStudent();
				break;
			case 4:
				view.modifyOne();
				break;
			case 5:
				view.deleteStudent();
				break;
			case 9:
				break end;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (true);
		System.out.println("프로그램이 종료되었습니다.");
	}

}

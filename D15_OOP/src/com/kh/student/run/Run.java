package com.kh.student.run;

import com.kh.student.view.StudentView;

public class Run {
	public static void main(String [] args) {
		
		//studentview�� �޼ҵ带 ������ ����.
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (true);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}

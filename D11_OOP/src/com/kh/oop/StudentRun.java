package com.kh.oop;

public class StudentRun {
	public static void main(String [] args) {
		
		// ����� Ŭ����
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
					System.out.println("1-3������ ���ڸ� �Է����ּ��� ");
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
	}

}

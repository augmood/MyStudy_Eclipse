package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private PersonController pc;
	
	public PersonMenu() {
		sc = new Scanner(System.in); 
		pc= new PersonController();
	}
	
	public void mainMenu() {
		/*
		 * 학생은 최대 3명까지 저장할 수 있습니다.
		 * 현재 저장된 학생은 M명 입니다.
		 * 사원은 최대 10명까지 저장할 수 있습니다.
		 * 현재 저장된 사원은 N명 입니다.
		 * M과 N에 들어가는 숫자는 PersonCollector 클래스에 있는
		 * PersonCount() 메소드의 반환값을 이용하여 출력.
		 * 
		 * 1. 학생메뉴
		 * 2. 사원메뉴
		 * 9. 끝내기  "종료하였습니다." 출력후 종료
		 * 메뉴번호 : 잘못 입력했을 경우 "잘못 입력하셨습니다. 다시 입력해주세요" 출력 후 반복 
		 */
		
		int menu = 0;
		
		do {
			int [] counts = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+counts[0]+"명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 "+counts[0]+"명입니다.");
			
			System.out.println("1.학생 메뉴");
			System.out.println("2.사원 메뉴");
			System.out.println("9.끝내기");
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}while (menu != 9);
		
	}
	
	public void studentMenu() {
		
		end :
		while (true) {
		
		System.out.println("1.학생 추가 ");
		System.out.println("2.학생 보기 ");
		System.out.println("9.메인으로 ");
		System.out.print("메뉴번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			if (pc.personCount()[0] != 3) {
			insertStudent();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			break;
		case 2 :
			printStudent();
			break;
		case 9 :
			break end;
			}
		
		}
	}
	
	public void employeeMenu() {
		
	}
	
	public void insertStudent() {
		
		while(true) {
		int [] counts = pc.personCount();
		System.out.print("학생 이름  : ");
		String name = sc.next();
		System.out.print("학생 나이  : ");
		int age = sc.nextInt();
		System.out.print("학생 키  : ");
		Double height = sc.nextDouble();
		System.out.print("학생 몸무게  : ");
		Double weight = sc.nextDouble();
		System.out.print("학생 학년  : ");
		int grade = sc.nextInt();
		System.out.print("학생 전공  : ");
		String major = sc.next();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		if(counts[0] < 2) {
			System.out.println("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char goYn = sc.next().charAt(0);
			if(goYn == 'N' || goYn == 'n' ) {
				break;
			}else {
				continue;
				}
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				break;
			}
		}
		
	}
	
	public void printStudent() {
		Student [] stds = pc.printStudent();
		int [] counts = pc.personCount();
		for (int i = 0; i < pc.personCount()[0]; i++){
			System.out.printf("%s , %d , %.1f , %.1f , %d , %s \n", 
					stds[i].getName(),stds[i].getAge(),stds[i].getHeight(),
					stds[i].getWeight(),stds[i].getGrade(),stds[i].getMajor());
		}
		
	}
	
	public void insertEmployee() {
		
		System.out.print("직원 이름  : ");
		String name = sc.next();
		System.out.print("직원 나이  : ");
		int age = sc.nextInt();
		System.out.print("직원 키  : ");
		Double height = sc.nextDouble();
		System.out.print("직원 몸무게  : ");
		Double weight = sc.nextDouble();
		System.out.print("직원 연봉  : ");
		int salary = sc.nextInt();
		System.out.print("직원 부서  : ");
		String dept = sc.next();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
	}
	
	public void printEmployee() {
		
	}

}

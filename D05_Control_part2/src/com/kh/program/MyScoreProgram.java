package com.kh.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String [] args) {
		/*
		 * ===== 메인 메뉴 =====
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 1
		 * 
		 * ===== 성적 입력 =====
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * ===== 메인 메뉴 =====
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 
		 * 
		 *  ===== 성적 출력 =====
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 총점 : 120
		 * 평균 : 40.00
		 * 
		 *  ===== 메인 메뉴 =====
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 3
		 * 
		 * G O O D B Y E - !
		 * 
		 */
		
		/*
		 * 1. 스캐너를 쓴다 (값을 받아야 한다. -> 값을 받는건 두개가 필요 선택 번호와 점수)
		 * 2. 메뉴를 선택하면 각자의 결과물을 보여준다. (switch case문 )
		 * 3. 다시 그 메뉴가 나오게 한다.
		 * 4. 종료를 누르면 break 메세지가 뜨게 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int total = 0;
		float avg = 0;
		
		종료 : // -> while 무한루프 밖에다가 종료하면 break 문을 걸어서 밖으로 나오게
		while(true) {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		 
		switch(choice) {
		case 1:
			System.out.println("===== 성적 출력 =====");
			do { // ------> 유효한 범위 안의 점수가 아니면 계속 다시 묻겠다.
				System.out.print("국어 : ");
				num1 = sc.nextInt(); // -> 위에서 선언한 것을 쓰겠다
				if(num1 < 0 || num1 > 100) {
					System.out.println("다시 입력해주세요");	
				}
			}while(num1 < 0 || num1 > 100);
			do {
				System.out.print("수학 : ");
				num2 = sc.nextInt();
				if(num2 < 0 || num2 > 100) {
					System.out.println("다시 입력해주세요");	
				}
			}while(num2 < 0 || num2 > 100);
			do {
				System.out.print("영어 : ");
				num3 = sc.nextInt();
				if(num3 < 0 || num3 > 100) {
					System.out.println("다시 입력해주세요");	
				}
			}while(num3 < 0 || num3 > 100);
			break;
			
		case 2:
			//-> case1의 변수들이 같이 안딸려옴
			//-> num들은 case1 안에서 선언 되었기 때문에 여기서 쓸 수 X
			//-> 아예 바깥에 변수 선언을 해주어야 함 -> 이걸 몰랐음
			System.out.println("===== 성적 출력 =====");
			total = num1+num2+num3; //---> 합 (위에 선언함)
			avg = total/3.0f;
			System.out.println("국어 : "+num1); 
			System.out.println("수학 : "+num2);
			System.out.println("영어 : "+num3);
			
			System.out.print("총점 : "+total);
			System.out.printf("  평균 : %2F \n", avg);
			break;
		case 3:
			System.out.println("G O O D B Y E !");
			break 종료;
		default :
			System.out.println("1~3 사이의 숫자를 입력해주세요");
			System.out.println();
			} 
				
		}
	}
}



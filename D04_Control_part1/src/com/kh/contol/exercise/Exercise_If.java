package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_If {
	
//	public void exercise1() {
		
		// 키보드로 정수를 입력받고 입력받은 정수가 양수이고
		// 짝수일 때 "짝수다"를 출력하고 짝수가 아니면 "홀수다" 출력
		// 단, 양수가 아니면 "양수만 입력해주세요"를 출력하세요
		
		// 정수하나 입력해주세요 : 4
		// 짝수다.
		
		// 정수 하나 입력해주세요 : -2
		// 양수를 입력해주세요.
//		System.out.println("첫번째 문제 실행입니다.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력해주세요 : ");
//		int num1 = sc.nextInt();
		
//		if (num1 > 0) {
//			if (num1%2 == 0 ) {
//			System.out.println("짝수다.");
//			} 
//			else if (num1%2 != 0 ) {
//				System.out.println("홀수다."); 
//			}
//		}
//		else {
//			System.out.println("양수를 입력해주세요.");
//		}
//		
//	}
	
//	public void exercise2() {
//		System.out.println("두번째 문제 실행입니다.");
//		/*
//		 * 1.입력
//		 * 2.수정
//		 * 3.조회
//		 * 4.삭제
//		 * 0.종료
//		 * 메뉴 번호를 입력하세요 : 3
//		 * 조회메뉴 입니다.
//		 * 잘못 입력하셨습니다.
//		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1.입력 ");
//		System.out.println("2.수정");
//		System.out.println("3.조회");
//		System.out.println("4.삭제");
//		System.out.println("0.종료");
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		int select = sc.nextInt();
//		if (select == 0 ) {
//			System.out.println("종료하시겠습니까?");
//			
//			}else if (select == 1 ) {
//				System.out.println("입력매뉴입니다."); 
//			}
//			else if (select == 2 ) {
//				System.out.println("수정메뉴입니다."); 
//			}
//			else if (select == 3 ) {
//				System.out.println("조회메뉴입니다."); 
//			}
//			else if (select == 4 ) {
//				System.out.println("삭제메뉴입니다."); 
//			}
//		
//		else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//	}
	
//		public void exercise3() {
//			System.out.println("세번째 문제 실행입니다.");
//			
//			/* 
//			 * 중간고사 기말고사 과제점수 출석횟수를 입력하고
//			 * Pass Fail을 출력하세요.
//			 * 평가 비율은 중간고사 20% 기말고사 30% 과제 30% 출석 100%로 이루어져있고
//			 * 이 때, 출석 비율은 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산
//			 * 70점 이상일 경우 Pass(출석 횟수 충족), 70점 미만이거나
//			 * 전체 강의의 30% 이상 결석시 Fail을 출력하세요.
//			 * 
//			 * 중간고사 점수 (20) : 70
//			 * 기말고사 점수 (30) : 80
//			 * 과제점수 (30) : 77
//			 * 출석점수 (100) : 18
//			 * 
//			 * 총점 : 78
//			 * Pass입니다.
//			 * 
//			 * Fail의 경우
//			 * 점수 통과 / 출석 미달
//			 * Fail [출석 횟수 부족] (13/20)
//			 * 
//			 * 점수미달  / 출석 통과
//			 * Fail [점수 미달] (총점 : 68)
//			 * 
//			 * 점수미달 / 출석미달
//			 * Fail [출석 횟수 부족] (13/20)
//			 * Fail [점수 미달] (총점 : 68)
//			 */
//			Scanner sc = new Scanner(System.in);
//			System.out.print("중간 고사 점수를 입력하세요 : ");
//			int mid = sc.nextInt();
//			System.out.print("기말 고사 점수를 입력하세요 : ");
//			int fin = sc.nextInt();
//			System.out.print("과제 점수를 입력하세요 : ");
//			int homework = sc.nextInt();
//			System.out.print("출석 횟수를 입력하세요 : ");
//			int attendance = sc.nextInt();
//			
//			// 점수 환산 (비율 반영) 후 더하기
//			double midTerm = mid*0.2;
//			double finTerm = fin*0.3;
//			double hw = homework*0.3;
//			double total = midTerm+finTerm+hw+attendance;
//			
//			//total값이 70점 이상이고 출석횟수가 70%초과인 경우 PASS
//			
//			if (total >= 70 && attendance > 20*0.7) 
//			{
//				System.out.println("총점 : "+total);
//				System.out.println("Pass 입니다.");
//			} else {
//				if(total >= 70) {
//					// 점수통과 / 출석미달
//					System.out.println("FAIL [출석 횟수 부족] : ("+attendance+"/20)");
//				}else if (attendance > 20*0.7) {
//					// 점수미달 / 출석통과
//					System.out.println("FAIL [점수 미달] : "+total);
//				}else {
//					System.out.println("FAIL [점수 미달] : "+ total);
//				    System.out.println("FAIL [출석 횟수 부족] : ("+attendance+"/20)");
//				}
//			}
////			else if (total >= 70 && attendance < 20*0.7)
////			{	
////				System.out.println("FAIL [출석 횟수 부족] : ("+attendance+"/20)");
////				
////			}
////			else if (total < 70 && attendance > 20*0.7)
////			{	
////				System.out.println("FAIL [점수 미달] : "+total);
////				
////			}
////			else if (total < 70 && attendance < 20*0.7)
////			{	
////				System.out.println("FAIL [점수 미달] : "+ total);
////				System.out.println("FAIL [출석 횟수 부족] : "+ attendance+"/20");
////				
////			}
//			
//		}
//
	}



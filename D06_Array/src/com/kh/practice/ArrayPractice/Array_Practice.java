package com.kh.practice.ArrayPractice;

import java.util.Random;
import java.util.Scanner;

public class Array_Practice {
	public void pracitce4() {
		/*
		 * 길이가 5인 String 배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후
		 * 배열 인덱스를 활용해서 귤을 출력하세용
		 */
		
		String [] arrs = {"사과", "귤", "포도", "복숭아","참외"};
		for (int i = 0; i < 5 ; i++) {
			if(arrs[i].equals ("귤"))
			System.out.print(arrs[i]);
		}
		System.out.println();
	}
	
	public void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. ---> ????
		 * 그리고 배열 전체의 값을 나열하고 각 인덱스에 저장한 값들의 합을 출력하세요.
		 */
		
		// 배열의 길이를 입력 받고 할당
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();	
		int [] arrs = new int[num];   // 값을 입력 받고 정수열 배열 선언
		int sum = 0;

		for(int i = 0; i < arrs.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i); // 여기서 이걸 어떻게 받아야 하는지??였음
			arrs[i] = sc.nextInt();
		}
		for(int i = 0; i < arrs.length; i++) {  // 값을 순서대로 출력하고, 합계 출력하기 
			System.out.print(arrs[i]+" ");
			sum+=arrs[i];
		}
		System.out.println();
		System.out.print("합계 : "+sum);
			
		
	}
	
	public void pracitce11() {
		/*
		 * 로또번호 자동생성기 프로그램 작성, 중복 값 없이 오름차순으로 정렬하시오
		 */
		
		// 로또 배열을 받는다.
		int [] lotto = new int [6];
		
		// 1~45 까지의 숫자를 랜덤하게 배열에 입력합니다.
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1; // 0~44 -> 1~45
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
					// 같은 값이 나오면 다른 값을 출력
					// i--를 하지 않으면 빠져나가서 증가식을 만나서 뒷 자리를 뽑게 됨
					
					break; 
				}
				
			}
		}
		// 오름차순으로 정렬한다.
		// 버블정렬을 써봐요
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < (lotto.length-1)-i; j++) {
				if (lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		for (int i= 0; i <lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
			
//		Random rand = new Random(); // 랜덤하게 수를 받을거임
//		int [] lotto = new int[6]; // 로또는 여섯자리니까 여섯자리를 받을 배열을 만들어줄거임
//		for(int i = 0; i < lotto.length; i++) { 
//			lotto[i] = rand.nextInt(45)+1; // 로또는 총 45까지 고를 수 있음 
//			for (int j = 0; j < i; j++) {
//					if (lotto[i] == lotto[j]) { // 이 부분을 잘 모르겠음 중복 값 없이 수를 받는 것 같음
//						 i--;
//					}
//			}
//			for(int k = i; k > 0; k--) {
//						int temp = lotto[k-1]; // 오름차순으로 값을 정렬해보려고 해요 
//						lotto[k-1] = lotto[k];
//						lotto[k] = temp;
//			} 
//		} for(int i = 0; i <lotto.length; i++) { // 로또 번호를 나열할거임
//			System.out.print(lotto[i]+" ");
//		}
		
	} 
		
	
	public void pracitce12() {
		
	}

}



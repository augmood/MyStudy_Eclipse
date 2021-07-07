package com.kh.control.exercise;

public class Exercise_ForDouble {
	
	public void exercise1() {
		/*
		 * 0시 0분부터 23시 59분까지 출력하기
		 * 0시 0분
		 * 0시 1분
		 * 0시 2분 
		 * ....
		 * 23시 59분
		 */
		for(int i = 0; i < 60; i++) {
			for(int j =0; j < 24; j++)
				System.out.printf("%2d시 %2d분\n", j, i);
		}
	}

	public void exercise2() {
		/*
		 * 구구단을 출력하되
		 * 2단 옆에 3단, 3단 옆에 4단
		 * 
		 * 2 tap 3 tap 4 tap 5 
		 */
		for(int k = 1; k <10; k++) { // 변동
			for(int l = 2; l <10; l++) { // 고정
				System.out.printf("%d * %d = %d \t", l , k, l*k);
			}
			System.out.println();
		}
		
	}
	
	public void exercise3() {
		
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		
		for(int m  = 0; m < 10; m++) { // 세로
			for(int n = 0; n < m+1; n++) { 
				// ㄴ 가로 ---> 이걸 몰라서 헤맴, 세로보다 가로가 하나 적게 출력되어야 함 
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

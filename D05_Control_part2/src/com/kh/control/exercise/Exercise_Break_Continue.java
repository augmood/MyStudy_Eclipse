package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Break_Continue {
	
	public void exercise1() {
		/* 정수하나를 입력받은 후
		 * 1부터 입력한 숫자까지의 합을 출력하시오
		 * 
		 * 숫자 하나 입력하세요 : 5
		 * 1부터 5까지의 합 : 15
		 * 
		 * 1+2+3+4
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) 
		{
			
			sum = sum+num;
			i++;
		}
		/* 
		 * int i = 1; // 1부터 더해야하니까
		 * while(true) {
		 *  sum += i; // 1부터 i까지 더해야함 
		 *  if (i == num) break; // i가 입력한 값까지만 더해야함
		 *  i++;
		 */ 
		System.out.println("1부터 "+num+"까지의 합은 : " + sum);

	}
	
	public void exercise2() {
		/*
		 * 1부터 100까지의 정수들의 합을 출력하는데
		 * 4의 배수는 빼고 더하여 출력하시오.
		 * 
		 */
	
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			
			//i가 4의 배수이면 sum+=i가 실행되지 않도록 함
			//continue가 실행되면 바로 증감식으로 간 후 조건식 실행
			if (i%4 == 0) continue;
			sum2 += i;
		}
		
		System.out.println("합은 "+sum2);

	}
	


}
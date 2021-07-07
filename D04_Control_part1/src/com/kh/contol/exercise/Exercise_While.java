package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오. 
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum +=i;
			i += 2;
		}
		System.out.println("1부터 100사이 홀수의 합 : "+sum);
		
	}
	
	public void exercise2() {
		// while문을 이용하여 정수를 하나 입력받아 그 수가 1 ~ 9사이의 수 일때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하시오.
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력해주세요 : ");
		int dan = sc.nextInt();
		if (dan >=1 && dan <= 9) {
			int j = 1;
			while(j < 10) {
				System.out.printf("%d * %d = %d \n", dan, j, dan*j);
				j++;
			}
		}else {
			System.out.println("1 - 9 사이의 양수를 입력해야 합니다.");
		}
	}
	
	public void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		while (num != -1) {
			sum+=num;
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("입력하신 수의 합은 : "+sum);
	}
		
	
	public void exercise4() {
		/*
		 *  while문을 이용하여 -1이 될때까지 정수 여러개를 입력받고 평균을 출력하시오.
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  정수의 개수는 5개이며 평균은 0.6입니다.
		 *  
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  -1
		 *  입력된 수가 없습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum2 = 0;
		int count = 0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요. ");
		int input = sc.nextInt();
		while (input != -1) { //
			sum2+=input;
			count++;
			input = sc.nextInt(); //계속 입력을 또 받아야 하니까!
		}
		if (count == 0 ) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			// 평균 출력
			System.out.println("정수의 개수는 "+count+"개 이며");
			System.out.println("평균은"+(double)sum2/count+"입니다.");

		}

}
}


package com.kh.contol.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {
		// 1에서 100사이의 자연수 중 홀수만 더하여 출력하시오
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("홀수들의 합은 : " + sum);
	}

	public void exercise2() {
		// 정수를 하나 입력 받아서 그 수가 1~9 사이의 수 일때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다."
		// 를 출력하시오. -> 여길 모르겠어 (if-else 문으로 해결하면 되는 거임)

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력해주세요. : ");
		int j = sc.nextInt();
		if (j >= 1 && j <= 9) {
			// 구구단 출력
			for (int k = 1; k <= 9; k++) {
				// System.out.println(j+"*"+k+"="+k*j);
				System.out.printf("%d * %d = %d\n", j, k, j * k);
			}

		} else {
			System.out.println("1~9 사이의 양수를 입력해야 합니다.");
		}

	}

	public void exercise3() {
		/*
		 * 1부터 10까지의 덧셈을 표시하고 합도 구하시오 1+2+3+4+5+6+7+8+9+10 = 55
		 */
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
				// 1+
				// 9
			} else {
				System.out.print("=");
				System.out.print(sum2);

			}

		}

	}
}

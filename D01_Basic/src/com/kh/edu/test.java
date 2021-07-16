package com.kh.baseball;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] ars) {



		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("배열의 크기 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		
		if (num >= 0) {
		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(100) + 1;
			sum += arr[i];
				for (int j = 0; j < i; j++) {
					if (arr[j] == arr[i]) {
						i--;
					}
				}
			} System.out.println("합계 = " + sum);
		}else {
			System.out.println("배열의 크기는 양수로 입력해야 합니다!");
		}
	}	
}	



//고객 요구사항에
//맞춰 배열을
//이용한 난수의
//합계 구하는
//프로그램을 개발하려고
//한다.고객의 요구사항대로
//동작하도록 프로그램을
//작성하시오
//고객 요구사항
//
//2-1.
//배열의 크기를
//스캐너를 통해
//입력을 받아 0
//이상인 경우
//입력받은 크기만큼
//정수형 배열을 할당,
//
//0
//미만인 경우"배열의 크기는 양수로 입력해야 합니다!"
//출력 후 종료.
//
//2-2. 배열에 1~100
//사이의 난수를
//생성하여 대입
//
//단,
//중복값을 제거하여
//중복이 발생하지
//않도록 한다.
//
//2-3
//배열에 담긴
//난수들의 합계를
//구하여 출력한다.
//
//정상 실행
//결과 예시
//
//----0
//미만 정수를
//입력한 경우----
//
//배열의 크기 입력:-5
//
//배열의 크기는
//양수로 입력해야 합니다!
//
//----0
//이상의 정수를
//입력한 경우-----
//
//배열의 크기 입력:5
//
//sum=291<--
//배열 내의
//난수들의 합계가
//출력되기 때문에
//결과는 예시와
//다를 수
//있음
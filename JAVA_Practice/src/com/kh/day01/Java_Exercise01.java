package com.kh.day01;

import java.util.Random;
import java.util.Scanner;

public class Java_Exercise01 {
	public static void main(String [] args) {
//		숫자맞추기 게임이다. 
//		1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 
//		사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다 
//		사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 
//		몇 번 만에 숫자를 맞췄는지 알려주도록 프로그램을 작성하시오.
// 		자바의 정석  4-14 문제
		
// 		스캐너와 랜덤, 카운트 필요 
		
		Scanner sc = new Scanner(System.in);
		int answer = new Random().nextInt(100)+1; // 100사이의 무작위 숫자를 받는다 
		
		int count = 0; // 몇번 돌렸는지 카운트 해주기 위해 변수 만들어줌
		System.out.println("===== 숫자 맞추기 게임 =====");
		
		do {
			count++; // 루프 돌리는 횟수 세어주고
			System.out.print("1부터 100사이의 숫자를 입력하세요 : ");
			int num = sc.nextInt(); // 숫자를 적어준다
			
			if(answer > num) {
				System.out.println("더 큰 수를 입력하세요");
			}else if (answer < num) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println(count+"번만에 맞췄습니다.");
				break;
			}
	
		} while(true);
	}

}

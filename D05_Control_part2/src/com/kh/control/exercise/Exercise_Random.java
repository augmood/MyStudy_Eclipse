package com.kh.control.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {
	public void exercise1() {
		// 동전 앞 뒤 맞추기
		// 1 또는 2 생성 -> 변수에 저장
		// 입력값을 받고 저장된 변수와 비교하여 같으면 정답, 다르면 오답
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		// 1 또는 2 생성 후 변수에 저장
		// 1 ~ 2 사이의 난수
		// rand.nextInt()
		int coin = rand.nextInt(2)+1; // -> +1을 해야 랜덤이 되는 것
		System.out.print("숫자를 입력해주세요 (앞면 1 / 뒷면 2): ");
		int player = sc.nextInt();
		
		if (coin == player) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
	}
	/* 개선사항
	 * 1. 무한반복 게임
	 * 2. 1, 2외의 값을 선택하면 다시 고르기
	 * 3. 0을 입력하면 게임 종료
	 */


	public void exercise2() {
		// 가위/바위/보
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 1
		// 당신은 가위를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 컴퓨터가 승리하였습니다..loser..
		
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 2
		// 당신은 바위를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 비겼습니다!!
		
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 3
		// 당신은 보를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 플레이어가 승리하였습니다!!

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rcp = rand.nextInt(4)+1; // -> +1을 해야 랜덤이 되는 것
		System.out.print("가위 바위 보를 입력하세요 (가위 1 / 바위 2 / 보 3): ");
		int player1 = sc.nextInt();
		
		if (rcp == player1) {
			System.out.println("플레이어는"+player1+"을 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("비겼습니다.");
		} else if (rcp == 1  && player1 == 3)
		{
			System.out.println("플레이어는"+player1+"을 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("플레이어가 졌습니다.");
		}
		else if (rcp == 1  && player1 == 2)
		{
			System.out.println("플레이어는"+player1+"을 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("플레이어가 이겼습니다.");
		}
		else if (rcp == 2  && player1 == 1)
		{
			System.out.println("플레이어는"+player1+"을 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("플레이어가 졌습니다.");
		}
		else if (rcp == 2  && player1 == 3)
		{
			System.out.println("플레이어는"+player1+"을 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("플레이어가 졌습니다.");
		}
		else if (rcp == 3  && player1 == 1)
		{
			System.out.println("플레이어는"+player1+"을/를 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"을 냈습니다.");
			System.out.println("플레이어가 졌습니다.");
		}
		else if (rcp == 3  && player1 == 2)
		{
			System.out.println("플레이어는"+player1+"를 냈습니다.");
			System.out.println("컴퓨터는"+rcp+"를 냈습니다.");
			System.out.println("플레이어가 이겼습니다.");
		}

	}

	public void exercise3() {
		// UP & DOWN 게임
		// 이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다
		// 0을 입력하면 게임을 종료합니다.
		// 숫자를 입력해주세요(user) : 55
		// UP!!
		// 숫자를 입력해주세요(com) : 35
		// UP!!
		// 숫자를 입력해주세요(user) : 66
		// DOWN!!
		// 숫자를 입력해주세요(com) : 22
		// DOWN!!
		// 숫자를 입력해주세요(user) : 11
		// user가 정답을 3번만에 맞췄습니다!!
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int updown = rand.nextInt(101)+1;
		System.out.print("1과 100 사이의 수 하나를 입력하세요 : ");
		int player2 = sc.nextInt();
		
	
		while (true) {
			if (updown == player2) {
				System.out.print("정답입니다.");
			} else if (updown > player2) {
				System.out.print("DOWN");
			} else if (updown < player2) {
				System.out.print("UP");			
			} else break; 
			{
				System.out.print("게임을 종료합니다.");
				
			}

		}
	}
}

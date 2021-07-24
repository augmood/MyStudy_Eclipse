package com.kh.day02;

public class Java_Exercise02 {
	public static void main(String [] args) {
		/* 
		 * 다음은 거스름돈을 몇개의 동전으로 지불할 수 있는지를 계산하는 문제이다
		 * 변수 money의 금액을 동전으로 바꾸었을때 각각 몇개의 동전이 필요한지 계산해서 출력하라
		 * 단, 가능한 적은 수의 동전으로 거슬러 주어야 한다.
		 */
		
		/*
		 * 수가 큰 순서대로 나누고 나눈 값을 저장해야함
		 */
		
		int money = 2680;
		int [] coinValue = {500, 100, 50, 10};
		
		System.out.println("money = "+money+"원");
		
		
		for (int i = 0; i < coinValue.length; i++) {
			System.out.println(coinValue[i]+"원 : " + money / coinValue[i]);
			money %= coinValue[i];
			
		} 
		
	}

}

package com.kh.method.exercise;

import java.util.Random;

public class Exercise_Method {
	public void exercise1() {
		System.out.println("매개변수도 없고 반환형도 없이 또 다른 메소드를 불러 실행시킴");
	}
	
	public void exercise2() {
		int [] lotto = new int[6];
		Random rand = new Random();
		
		for(int i = 0; i <lotto.length; i++) {
			lotto[i] = printRandNum(); // == rand.nextInt(45)+1 로또번호 랜덤출력 기능
		}
		for(int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public int printRandNum() {
		Random rand = new Random();
		int num = rand.nextInt(45)+1;
		return num;
	}

}

package com.kh.rand;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 30; i++) {
			//nextInt(n) -> 0부터 n-1까지의 랜덤한 수
			//nextInt(10) -> 0부터 9까지의 랜덤한 수 
			System.out.println(rand.nextInt(10));
		}
		System.out.println();
		// 1~10 사이의 랜덤한 수 출력?
		
		//nextInt(10) -> 0~9 랜덤한 수
		//nextInt(10)+1 -> 1~10 랜덤한 수
		
		for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(10)+1+" ");
		}
		System.out.println();
		
		//20~35 사이의 랜덤한 수를 구하고 싶다.
		//0부터 시작하는 범위를 구해야한다. -> 20을 뺀다. 0~15 (16개)
		
		//nextInt(n) -> 0부터 n-1까지의 랜덤한 수
		//nextInt(10) -> 0부터 9까지의 랜덤한 수 
		//nextInt(20) -> 0부터 19까지의 랜덤한 수 
		//nextInt(16) -> 0부터 15까지의 랜덤한 수 (+20)
		for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(16)+20+" ");
		}
	}
	
	

}

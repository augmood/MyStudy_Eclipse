package com.kh.method.exercise;

import java.util.Random;

public class Exercise_Method {
	public void exercise1() {
		System.out.println("�Ű������� ���� ��ȯ���� ���� �� �ٸ� �޼ҵ带 �ҷ� �����Ŵ");
	}
	
	public void exercise2() {
		int [] lotto = new int[6];
		Random rand = new Random();
		
		for(int i = 0; i <lotto.length; i++) {
			lotto[i] = printRandNum(); // == rand.nextInt(45)+1 �ζǹ�ȣ ������� ���
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

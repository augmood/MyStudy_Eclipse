package com.kh.day02;

public class Java_Exercise02 {
	public static void main(String [] args) {
		/* 
		 * ������ �Ž������� ��� �������� ������ �� �ִ����� ����ϴ� �����̴�
		 * ���� money�� �ݾ��� �������� �ٲپ����� ���� ��� ������ �ʿ����� ����ؼ� ����϶�
		 * ��, ������ ���� ���� �������� �Ž��� �־�� �Ѵ�.
		 */
		
		/*
		 * ���� ū ������� ������ ���� ���� �����ؾ���
		 */
		
		int money = 2680;
		int [] coinValue = {500, 100, 50, 10};
		
		System.out.println("money = "+money+"��");
		
		
		for (int i = 0; i < coinValue.length; i++) {
			System.out.println(coinValue[i]+"�� : " + money / coinValue[i]);
			money %= coinValue[i];
			
		} 
		
	}

}

package com.kh.rand;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 30; i++) {
			//nextInt(n) -> 0���� n-1������ ������ ��
			//nextInt(10) -> 0���� 9������ ������ �� 
			System.out.println(rand.nextInt(10));
		}
		System.out.println();
		// 1~10 ������ ������ �� ���?
		
		//nextInt(10) -> 0~9 ������ ��
		//nextInt(10)+1 -> 1~10 ������ ��
		
		for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(10)+1+" ");
		}
		System.out.println();
		
		//20~35 ������ ������ ���� ���ϰ� �ʹ�.
		//0���� �����ϴ� ������ ���ؾ��Ѵ�. -> 20�� ����. 0~15 (16��)
		
		//nextInt(n) -> 0���� n-1������ ������ ��
		//nextInt(10) -> 0���� 9������ ������ �� 
		//nextInt(20) -> 0���� 19������ ������ �� 
		//nextInt(16) -> 0���� 15������ ������ �� (+20)
		for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(16)+20+" ");
		}
	}
	
	

}

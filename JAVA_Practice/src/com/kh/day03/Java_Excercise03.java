package com.kh.day03;

import java.util.Random;
import java.util.Scanner;

public class Java_Excercise03 {
	public static void main(String [] args) {
//		#1 �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*���� �� �׷����� �׸��� ���α׷��̴�.
//		int [] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
//
//		3***
//		2**
//		2**
//		4****
		
		int [] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int [] pick = new int[4];
		
		System.out.println("�����");
        
//        pick[0] = answer[0];
//        pick[1] = answer[1];
//        pick[2] = answer[2];
//        pick[3] = answer[3];
		
		Random rand = new Random();
		for(int i = 0; i < pick.length; i++) {
			int index = rand.nextInt(answer.length);
			pick[i] = answer[index];

		}
        
        for(int i = 0; i< pick.length ;i++) {
        		System.out.print(pick[i]);
        		for (int j = 0; j < pick[i]; j++) {
        			System.out.print("*");
        		}
        	}
        	System.out.println();
        }

	}




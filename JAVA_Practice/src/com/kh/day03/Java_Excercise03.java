package com.kh.day03;

import java.util.Random;
import java.util.Scanner;

public class Java_Excercise03 {
	public static void main(String [] args) {
//		#1 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서 그래프를 그리는 프로그램이다.
//		int [] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
//
//		3***
//		2**
//		2**
//		4****
		
		int [] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int [] pick = new int[4];
		
		System.out.println("별찍기");
        
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




package com.kh.control;

public class Exam_For1 {
	public static void main(String [] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("��µ� i�� �� : "+i);
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println("��µ� i�� �� :"+i);
		}
		
		for(int i = 0; i < 20; i += 2) {
			 // i = 0, true  , i = 2 -> �̷��� ������
			System.out.println("��µ� i�� �� :"+i);
			// i = 0, true, i = 2
		}
	}
}

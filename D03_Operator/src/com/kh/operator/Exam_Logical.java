package com.kh.operator;

public class Exam_Logical {
	public static void main (String [] args) {
		
		// a�� 50, b�� 30�� �� ������ ������ ����� �����غ�����
		System.out.println("�������� ����");
		
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = (a!=b) && (a<b);  // t f = f
		result2 = (a<b) || (a==b); // f f = f
		result3 = (a>b) && (a!=b); // t t = t
		result4 = (a>b) || (a==b); // t f = t
		
		System.out.println("result1 ��� : " + result1);
		System.out.println("result2 ��� : " + result2);
		System.out.println("result3 ��� : " + result3);
		System.out.println("result4 ��� : " + result4);
		System.out.println();

		// c�� 70, d�� 55�϶� ������ ������ ����� �����غ�����
		System.out.println("�������� ���� 2");
		
		int c = 70;
		int d = 55;
		
		boolean result5, result6, result7, result8;
				
		result5 = (c==d) || (c++<100); // t
		result6 = (c>d) && (--d <55); // t 
		// --> ���⼭  && �ڴ� ���X, �� �ʿ䰡 ��� 
		result7 = (c!=d) && (d--<c++); // t
		result8 = (c++ !=d) || (d++ >=85); // t
		// --> ���⼭  || �ڴ� ���X, �� �ʿ䰡 ��� 
		
		System.out.println("result5 ��� : " + result5);
		System.out.println("result6 ��� : " + result6);
		System.out.println("result7 ��� : " + result7);
		System.out.println("result8 ��� : " + result8);
		System.out.println("c�� �� : "+ c + " , d�� �� : "+ d );

		
	}

}

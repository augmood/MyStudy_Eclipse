package com.kh.operator;

public class Exam_Compound {
	public static void main(String [] args) {
		
		//복합 대입 연산자
		
		int a = 10;
		int b = 20;
		int c = 189;
		
		System.out.println(a+=20); // 30 , a=30
		System.out.println(b*=3); //60 , b=60
		System.out.println(c/=5); //6 c=6
		System.out.println(c%=a);//0 30%6
		System.out.println(c-=a); //20 c=6 a
	}

}

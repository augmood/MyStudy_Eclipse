package com.kh.operator;

public class Exam_Logical {
	public static void main (String [] args) {
		
		// a가 50, b가 30일 때 다음의 논리연산 결과를 예상해보세요
		System.out.println("논리연산자 예제");
		
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = (a!=b) && (a<b);  // t f = f
		result2 = (a<b) || (a==b); // f f = f
		result3 = (a>b) && (a!=b); // t t = t
		result4 = (a>b) || (a==b); // t f = t
		
		System.out.println("result1 결과 : " + result1);
		System.out.println("result2 결과 : " + result2);
		System.out.println("result3 결과 : " + result3);
		System.out.println("result4 결과 : " + result4);
		System.out.println();

		// c가 70, d가 55일때 다음의 논리연산 결과를 예상해보세요
		System.out.println("논리연산자 예제 2");
		
		int c = 70;
		int d = 55;
		
		boolean result5, result6, result7, result8;
				
		result5 = (c==d) || (c++<100); // t
		result6 = (c>d) && (--d <55); // t 
		// --> 여기서  && 뒤는 계산X, 할 필요가 없어서 
		result7 = (c!=d) && (d--<c++); // t
		result8 = (c++ !=d) || (d++ >=85); // t
		// --> 여기서  || 뒤는 계산X, 할 필요가 없어서 
		
		System.out.println("result5 결과 : " + result5);
		System.out.println("result6 결과 : " + result6);
		System.out.println("result7 결과 : " + result7);
		System.out.println("result8 결과 : " + result8);
		System.out.println("c의 값 : "+ c + " , d의 값 : "+ d );

		
	}

}

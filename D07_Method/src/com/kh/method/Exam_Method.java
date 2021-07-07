package com.kh.method;

public class Exam_Method {
	public static void main(String [] args) {
		calcNumPrint();
		System.out.println("매개변수 없고 반환형 있는 메소드로 출력: "+calcNum());
		calcNumPrint(500);
		System.out.println("매개변수 있고 반환형 있는 메소드로 출력: "+calcNum(500));
	}
		
	static int calcNum(int x) {
		return x+500;
	}
	
	static void calcNumPrint(int x) {
		System.out.println("매개변수가 있고 반환형 없는 메소드로 출력: "+(x+500));
	}
	
	// void는 원래 뭘 반환하지 X , but이건 반환형임 위에서 레버를 돌려주면 값을 반환하는 것
	static int calcNum() {
		return 5; 
	}

	// 얘는 호출의 개념이 아님 그냥 5 값을 적으라고 한거임
	static void calcNumPrint() {
		System.out.println("매개변수 없고 반환형 없는 메소드로 출력 : "+ 5);
	} 

} 

package com.kh.typetrans;

public class TestTypeTrans {
	public static void main(String [] args) {
		int iNum = 12;
		double dNum = 3.3;
		double result = iNum + dNum;
		System.out.println("자동형변환 연산의 결과값 : "+result);
		// 큰 -> 작은 데이터 타입으로 변환되면서 데이터의 손실이 일어나는 강제 형변환
		System.out.println("강제형변환을 통한 결과값 : "+(int)result);
		
		int b = 890831;
		double i = b;
		System.out.println("무야호 : "+(int)i);
	
	}

}
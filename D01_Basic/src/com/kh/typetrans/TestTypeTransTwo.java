package com.kh.typetrans;

public class TestTypeTransTwo {
	public static void main(String [] args){
	int num = 2147483647;
	int result = num+1;
	System.out.println("결과값 : "+result); 
	// -> 최대값에서 +1이 되어 오버플로우가 나서 -가 되는거
	
	long result_=(long)num+1;
	//자동형변환이 되지 않은 경우 작은 데이터타입에서 큰 데이터타입으로 강제형변환
	
	System.out.println("수정한값 :"+result_); // -> 오버플로우가 나지 않음

	}
}

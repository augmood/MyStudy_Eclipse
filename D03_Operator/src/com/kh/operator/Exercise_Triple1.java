package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력하세요
	// 너무 어려우면 양수, 음수 판별부터 해보세요
	
	// 정수를 입력해주세요 : -1
	// -1은/는 음수입니다.
	//정수를 입력해주세요 : 0
	// 0은/0입니다.
	// 0인지 아닌지 판별, 0일때는 0입니다. 0이 아닐때는 양수/음수 판별
	// result = num == 0 ? " 0 입니다" : (num>0 )"양수입니다." : "음수입니다."
	
	System.out.println("정수를 입력해주세요");
	int num = sc.nextInt();
	String result = num == 0 ? " 0 입니다" : (num>0) ? "양수입니다." : "음수입니다.";
	//-> 이 문장이 핵심 이거 몰라서 //boolean isNegativeNum = (num%2 != 0); 이렇게 세개 만듦
	System.out.println(num+"은/는"+result);
	//boolean isNegativeNum = (num%2 != 0);
	//System.out.println(isNegativeNum+"은/는 음수입니다."); 

}
}

package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
		
	//두 수와 '+'또는 '-'를 입력받아 알맞은 계산 결과 출력하기
	// 단, '+', '-'이외의 연산자 입력시 "잘못 입력하셨습니다" 출력하기
	// 첫번째 수 : 6
	// 두번째 수 : 12
	// 연산자 입력 (+ or -) : +
	// 결과 : 18
	
	System.out.println("첫번째 수를 입력해 주세요");
	int firstnum = sc.nextInt();
	
	System.out.println("두번째 수를 입력해 주세요");
	int secondnum = sc.nextInt();
	
	System.out.println("연산자 (+ or -) 를 입력해 주세요"); // -> 플마를 뭘로 받아야 할지 몰라서....
	char op = sc.next().charAt(0); //-> 여기까진 맞음
	
	// 연산자가 +인가? 참이면 둘 더한다 : 거짓이면 연산자가 -인지 확인한다. 
	// 연산자가 -인가? 참이면 빼겠다. : 거짓이면 잘못 입력하셨습니다.를 출력한다. -> 이걸 무슨 변수로 받아
	// 1. 숫자를 스트링으로 바꿔버리기 -> 숫자를 문자열에 붙이면 그냥 문자열이 됨 !!!
	// 2. String.valueOf(숫자) 로 변경한다.
	String result = op == '+' ? String.valueOf(firstnum+secondnum) : op == '-' ? String.valueOf(firstnum-secondnum) : "잘못 입력하셨습니다";
	System.out.print("결과 : "+result);

}
}
